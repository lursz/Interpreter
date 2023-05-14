from .b_VariableVisitor import VariableVisitor

class BooleanVisitor(VariableVisitor):
    def getBoolean(self, variableName: str) -> (bool | None):
        # TODO: check global and scope
        if len(self.function_bools) > 0 and variableName in self.function_bools[-1].keys():
            return self.function_bools[-1][variableName]
        return self.booleans[variableName] if variableName in self.booleans.keys() else None
    
    

    def visitBooleanValue(self, ctx):
        codes = list(ctx.getChildren())
        return self.visit(codes[0]) if codes[0].getText() not in ['TRUE', 'FALSE'] else ctx.getText() == "TRUE"


    def visitCondition(self, ctx):
        codes = list(ctx.getChildren())
        condition_value = self.getBoolean(codes[0].getText())
        condition_value = self.visit(codes[0]) if condition_value == None else condition_value 
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

        for condition_product in codes[2::2]:
            match codes[1].getText():
                case "AND":
                    condition_value = condition_value and self.visit(condition_product)
                case "==":
                    condition_value = condition_value == self.visit(condition_product)
                case "!=":
                    condition_value = condition_value != self.visit(condition_product)
        return condition_value
    
    
    
    
    # If statement, 
    def visitCommands(self, ctx) -> None:
        if self.returnEncountered:
            return
        codes = list(ctx.getChildren())
        if codes[0].getText() == 'IF':
            result = self.visit(codes[2])
            # print(result)
            if result:
                for i in range(5, len(codes)):
                    if self.returnEncountered:
                        return
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
                    if self.returnEncountered:
                        return
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
                    if self.returnEncountered:
                        return
                    self.visit(code)
                #self.variables[var_name] += 1
                self.setVariable(var_name, self.getVariable(var_name))
            

        if codes[0].getText() == 'WHILE':
            condition = self.visit(codes[2])

            while condition:
                for code in codes[5:-1]:
                    if self.returnEncountered:
                        return
                    self.visit(code)
                condition = self.visit(codes[2])
                
                