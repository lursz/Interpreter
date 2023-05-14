from .c_BooleanVisitor import BooleanVisitor

class FunctionsVisitor(BooleanVisitor):

    def visitFun_commands(self, ctx) -> None:
        codes = list(ctx.getChildren())
        for i in codes:
            if self.returnEncountered:
                return
            self.visit(i)


    def visitExpressions(self, ctx) -> None:
        if self.returnEncountered:
            return
        codes = list(ctx.getChildren())
        for command in codes:
            self.visit(command)

    def chuj(self, ctx) -> None:
        print("chuj")
    
    def visitUse_fun(self, ctx) -> None:
        if self.returnEncountered:
            return
        codes = list(ctx.getChildren())
        function_name = codes[1].getText()
        type_arguments = self.functions[function_name]["type_arguments"]
        callback = self.functions[function_name]["callback"]
        variable_types = self.functions[function_name]["variable_types"]
        arguments = [self.visit(argument) for argument in codes[3:-1] if argument.getText() != ',']

        # Checking if types match
        if len(arguments) != len(type_arguments):
            raise Exception("Number of arguments does not match")

        self.function_vars.append({key: arguments[i] for i, key in enumerate(variable_types.keys()) if isinstance(arguments[i], int)})
        self.function_bools.append({key: arguments[i] for i, key in enumerate(variable_types.keys()) if isinstance(arguments[i], bool)})

        callback()

            
    def visitFunction_declaration(self, ctx) -> None:
        codes = list(ctx.getChildren())

        # type fun a(INT a, INT b, INT c)
        #  0    1  2  4  5   7  8  9   10
        # -> ['a', 'b', 'c']
        
        return_type = codes[0].getText()
        function_name = codes[2].getText()
        type_arguments = []
        variable_types = {}

        fun_var = {}
        fun_bool = {}

        start = 0
        # Extract all the variable names from function declaration
        for i in range(4, len(codes)):
            curr_value = codes[i].getText()
            if curr_value == ')':
                start = i+2
                break
            
            # save type argument
            if curr_value in ['INT', 'BOOLEAN']:
                var_name = codes[i+1].getText()
                variable_types[var_name] = curr_value
                type_arguments.append(curr_value)
                continue

            if curr_value in [',']: 
                continue
            # (value, type)
            if codes[i-1].getText() == 'BOOLEAN':
                fun_bool[curr_value] = False
            else:
                fun_var[curr_value] = 0

        def callback() -> (int | bool | None):
            for i in range(start, len(codes)):
                curr_value = codes[i].getText()
                if curr_value == '}':
                    break
                self.visit(codes[i])
                if self.returnEncountered:
                    # Check if the returned type matches function type
                    self.returnEncountered = False
                    if self.returnValue == None and return_type == 'VOID':
                        return
                    elif isinstance(self.returnValue, int) and return_type == 'INT':
                        x = self.returnValue
                        self.returnValue = None
                        return x
                    elif isinstance(self.returnValue, bool) and return_type == 'BOOLEAN':
                        x = self.returnValue
                        self.returnValue = None
                        return x
                    else:
                        raise Exception("Function return type does not match")
        #TODO: create self.functions in listener
        # self.functions[function_name] = callback    
        self.functions[function_name] = {
            "type_arguments": type_arguments,
            "callback": callback,
            "variable_types": variable_types
            
        }   

    def visitReturn(self, ctx) -> None:
        # It can return integer, boolean or None (for void type)
        codes = list(ctx.getChildren())
        # remove from stack
        self.function_vars.pop()
        self.function_bools.pop()
        
        self.returnValue = None if len(codes) == 1 else self.visit(codes[1])
        self.returnEncountered = True
        
