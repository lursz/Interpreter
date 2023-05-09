from antlr4 import *
from antlr.JailBreakLangParser import JailBreakLangParser
from antlr.JailBreakLangVisitor import JailBreakLangVisitor
import logic.GameObjects as GameObjects
import logic.GameLogic as GameLogic
import logic.Calculator as Calculator
import re
import warnings


class JailBreakLang(JailBreakLangVisitor):
    def __init__(self):
        self.game = GameObjects.GameObjects()
        # Global variables
        self.variables = {}
        self.booleans = {}

        # Stack of variables (used to handle functions)
        self.function_vars = []
        self.function_bools = []

        # {function_name: {type_arguments: '[INT', 'BOOLEAN', ...], callback: Function}
        self.functions = {}

    def getVariable(self, variableName: str):
        # TODO: check global and scope
        if len(self.function_vars) > 0 and variableName in self.function_vars[-1].keys():
            return self.function_vars[-1][variableName]
        #return self.variables[variableName] if variableName in self.variables.keys() else None
        return self.variables[variableName]
    
    def setVariable(self, variableName, value):
        if len(self.function_vars) > 0 and variableName in self.function_vars[-1].keys():
            self.function_vars[-1][variableName] = value
        elif variableName in self.variables.keys():
            self.variables[variableName] = value

    # Visit Start
    def visitStart(self, ctx):
        lines = list(ctx.getChildren())
        for i in range(len(lines) - 1):
            self.visit(lines[i])
        
        GameLogic.Gamelogic(self.game)

    # Visit Code
    def visitCode(self, ctx):
        codes = list(ctx.getChildren())

        for i in range(len(codes)):
            self.visit(codes[i])

    
    
    # Visit Objects
    def visitObjects(self, ctx):
        codes = list(ctx.getChildren())
        match codes[0].getText():
            case "MAP":
                rows = self.visitExpr(codes[2])
                cols = self.visitExpr(codes[4])
                self.game.createMap(rows, cols)
                #return map_array
                return
            case "PLAYER":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                self.game.createPlayer(row, col)
                return row, col
            case "EXIT":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                self.game.createExit(row, col)
                return row, col
            case "WALL":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                self.game.createWall(row, col)
                return row, col
            case "TRAP":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                self.game.createTrap(row, col)
                return row, col
            case "KEY":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                self.game.createKey(row, col)
                return row, col
            case "GATE":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                self.game.createGate(row, col)
                return row, col
            case "GUARD":
                row = self.visitExpr(codes[2])-1
                col = self.visitExpr(codes[4])-1
                guard_id = codes[6].getText()
                list_of_commands = codes[8:-1]
                list_of_commands = [i.getText() for i in list_of_commands]
                
                # Create a guard and append it to the list of guards
                self.game.createGuard(row, col, guard_id, list_of_commands)


                codes = list(ctx.getChildren())
                for i in range(len(codes)):
                    self.visit(codes[i])
                return row, col, guard_id
            case "PRINT":

                expression = self.visitExpr(codes[2])
                print(expression)
            
    

    
    # Declare new variable or redefine an existing one
    def visitVariables(self, ctx):
        codes = list(ctx.getChildren())
        
        # mode 0 - declare new variable, mode 1 - redefine existing variable
        mode = 0 if (codes[0].getText() in ['INT', 'BOOLEAN']) else 1
        var_name = ""
        for i in range(len(codes)):
            # Mode 0 - declare new variable
            if mode == 0:
                if i == 1:
                    # Check if the variable exists. If yes, raise an error.
                    if codes[i].getText() in self.variables.keys() or codes[i].getText() in self.booleans.keys():
                        warnings.warn("Variable already exists")
                    else:
                        # If declaring INT - create a new variable in the integers dictionary
                        if codes[0].getText() == "INT":
                            self.variables[codes[i].getText()] = 0
                            var_name = codes[i].getText()
                        # If declaring BOOLEAN - create a new variable in the booleans dictionary
                        else:
                            self.booleans[codes[i].getText()] = False
                            var_name = codes[i].getText()
                elif i == 3:
                    # If declaring INT - insert the actual value of int to the integers dictionary
                    if codes[0].getText() == "INT":
                        self.variables[var_name] = self.visit(codes[i])
                    # Same but with booleans
                    else:
                        self.booleans[var_name] = self.visit(codes[i])
            # Mode 1 - redefine existing variable   
            else:
                if i == 0:
                    # Check if the variable exists. If no, raise an error.
                    if codes[i].getText() not in self.variables.keys() and codes[i].getText() not in self.booleans.keys():
                        warnings.warn("Variable doesn't exist")
                    else:
                        var_name = codes[i].getText()
                elif i == 2:
                    # Redeclare INT
                    if var_name in self.variables.keys():
                        self.variables[var_name] = self.visit(codes[i])
                    # Redeclare BOOL
                    else:
                        self.booleans[var_name] = self.visit(codes[i])



    # Parse int from 'INT'
    def visitInt(self, ctx):
        return int(ctx.INT().getText())


    # Evaluate an expression
    def visitExpr(self, ctx) -> int:
        calc = Calculator.Calculator()
        codes = list(ctx.getChildren())
        
        
        math_string = ""
        for i in range(0, len(list(ctx.getChildren()))):
            # if codes[i].getText() in self.variables.keys():
            var_name = codes[i].getText()
            if var_name in self.variables.keys() or (len(self.function_vars)>0 and var_name in self.function_vars[-1].keys()):
                math_string += str(self.getVariable(var_name))
            else:
                math_string += var_name
        x = calc.evaluate(math_string)
        if x == None:
            warnings.warn(math_string + " is not a correct expression")
            exit()
        return int(x)
    
    def visitValue_comparison(self, ctx: JailBreakLangParser.Value_comparisonContext):
        operators = {
            "<": lambda x, y: x < y,
            ">": lambda x, y: x > y,
            "==": lambda x, y: x == y,
            "!=": lambda x, y: x != y,
        }
        
        codes = list(ctx.getChildren())
        
        return operators[codes[1].getText()](self.visit(codes[0]), self.visit(codes[2]))
        
    def visitVariable_value(self, ctx):
        codes = list(ctx.getChildren())
        
        if codes[0].getText() not in self.booleans:
            return self.visit(codes[0])

        return self.booleans[codes[0].getText()]

    def visitBooleanValue(self, ctx):
        codes = list(ctx.getChildren())
        
        if codes[0].getText() not in ['TRUE', 'FALSE']:
            return self.visit(codes[0])
        
        if ctx.getText() == "TRUE":
            return True
        else:
            return False

    def visitCondition(self, ctx):
        codes = list(ctx.getChildren())
        
        condition_value = self.visit(codes[0])
        for condition_product in codes[2:]:
            condition_value = condition_value or self.visit(condition_product)
        return condition_value
    
    def visitCondition_product(self, ctx):
        codes = list(ctx.getChildren())
        
        if codes[0].getText() == '(':
                return self.visit(codes[1])
        if codes[0].getText() == 'NOT':
            if len(codes) > 2:
                return not self.visit(codes[2])
            return not self.visit(codes[1])
        
        condition_value = self.visit(codes[0])
      
        for condition_product in codes[2:]:
            match codes[1].getText():
                case "AND":
                    condition_value = condition_value and self.visit(condition_product)
                case "==":
                    condition_value = condition_value == self.visit(condition_product)
                case "!=":
                    condition_value = condition_value != self.visit(condition_product)

        return condition_value
        
    # If statement, 
    def visitCommands(self, ctx):
        codes = list(ctx.getChildren())
        if codes[0].getText() == 'IF':
            result = self.visit(codes[2])
            if result:
                for i in range(5, len(codes)):
                    if codes[i].getText() == '}':
                        break
                    self.visitExpressions(codes[i])
            else_index = 0
            for i in range(0, len(codes)):
                    if codes[i].getText() == '}':
                        else_index = i
                        break
            if len(codes) > (else_index):
                for i in range(else_index+3, len(codes)):
                    if codes[i].getText() == '}':
                        break
                    self.visitExpressions(codes[i]) 
                #self.visitExpressions(codes[9])

        if codes[0].getText() == 'FOR':
            # FOR (x IN 10) { code  }
            #  0   2  3  4     7
            var_name = codes[2].getText()
            
            top_value = int(codes[4].getText())
            while self.getVariable(var_name) <= top_value:
                for code in codes[7:-1]:
                    self.visit(code)
                #self.variables[var_name] += 1
                self.setVariable(var_name, self.getVariable(var_name))
            

        if codes[0].getText() == 'WHILE':
            condition = self.visit(codes[2])

            while condition:
                for code in codes[5:-1]:
                    self.visit(code)
                condition = self.visit(codes[2])





    def visitExpressions(self, ctx):
        codes = list(ctx.getChildren())
        for command in codes:
            self.visit(command)

    def visitUse_fun(self, ctx):
        codes = list(ctx.getChildren())
        print([x.getText() for x in codes])
    
        function_name = codes[1].getText()
        print(self.functions[function_name])
        type_arguments = self.functions[function_name]["type_arguments"]
        callback = self.functions[function_name]["callback"]
        variable_types = self.functions[function_name]["variable_types"]

        arguments = [self.visit(argument) for argument in codes[3:-1] if argument.getText() != ',']
        print(arguments)

        # TODO: check if types match
        if len(arguments) != len(type_arguments):
            raise Exception("Number of arguments does not match")

        fun_var = {}
        fun_bool = {}

        for i, key in enumerate(variable_types.keys()):
            argument_type = 'INT' if type(arguments[i]) == type(1) else 'BOOLEAN'
            # if argument_type != type_arguments[i]:
            #     raise Exception("Argument type does not match")
            if argument_type != variable_types[key]:
                raise Exception("Argument type does not match")
            if argument_type == 'INT':
                fun_var[key] = arguments[i]
            else:
                fun_bool[key] = arguments[i]
        print(fun_var)
        print(fun_bool)
            
        self.function_vars.append(fun_var)
        self.function_bools.append(fun_bool)
        print(fun_var, fun_bool, "GOWNO")
        callback()
            
    def visitFunction_declaration(self, ctx):
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

        def callback():
            for i in range(start, len(codes)):
                # print(self.function_vars)
                # print(self.function_bools)
                curr_value = codes[i].getText()
                print(curr_value)
                if curr_value == '}':
                    break
                x = self.visit(codes[i])
                IF(a>5){RETURN
                        gfsdfg}
                print(i, x)
                if x is not None and len(x) == 2 and x[0] == "RETURN":
                    return x
                if x is not None and len(x) == 2 and x[0] == "RETURN":
                    # Check if the returned type matches function type
                    if x[1] == None and return_type == 'VOID':
                        return x[1]
                    # if type(x[1]) == type(int)
                    elif type(x[1]) == type(1) and return_type == 'INT':
                        return x[1]
                    elif type(x[1]) == type(True) and return_type == 'BOOLEAN':
                        return x[1]
                    else:
                        raise Exception("Function return type does not match")
        #TODO: create self.functions in listener
        # self.functions[function_name] = callback    
        self.functions[function_name] = {
            "type_arguments": type_arguments,
            "callback": callback,
            "variable_types": variable_types
            
        }   

    def visitReturn(self, ctx):
        # It can return integer, boolean or None (for void type)
        codes = list(ctx.getChildren())
        # remove from stack
        print("popping")
        self.function_vars.pop()
        self.function_bools.pop()
        
        return_value = None if len(codes) == 1 else self.visit(codes[1])
        return ("RETURN", return_value)


# class FunctionDeclaration:
#     def __init__(self, name, parameters, return_type, body):
#         self.name = name
#         self.parameters = parameters
#         self.return_type = return_type
#         self.body = body