from antlr.JailBreakLangParser import JailBreakLangParser
from .a_StartVisitor import JailBreakLang
import logic.Calculator
import warnings

class VariableVisitor(JailBreakLang):
    def getVariable(self, variableName: str) -> int:
        # TODO: check global and scope
        if len(self.function_vars) > 0 and variableName in self.function_vars[-1].keys():
            return self.function_vars[-1][variableName]
        print("variable: ", self.variables[variableName], "type: ",type(self.variables[variableName]))
        return self.variables[variableName]
    
    def setVariable(self, variableName, value) -> None:
        if len(self.function_vars) > 0 and variableName in self.function_vars[-1].keys():
            self.function_vars[-1][variableName] = value
        elif variableName in self.variables.keys():
            self.variables[variableName] = value
            



    # Declare new variable or redefine an existing one
    def visitVariables(self, ctx) -> None:
        if self.returnEncountered:
            return
        codes = list(ctx.getChildren())

        for i, code in enumerate(codes):
            var_name = code.getText()
            # Declare new variable
            if (codes[0].getText() in ['INT', 'BOOLEAN']):
                if i == 1: # If it's the second code block
                    # Check if the variable already exists. If yes, raise an error.
                    if var_name in self.variables or var_name in self.booleans:
                        raise Exception("Variable already exists")
                    else:
                        # If declaring INT - create a new variable in the integers dictionary
                        # If declaring BOOLEAN - create a new variable in the booleans dictionary
                        self.variables[var_name] = 0 if codes[0].getText() == "INT" else False
                # If it's the fourth code block
                elif i == 3:
                    # If declaring INT - insert the actual value of int to the integers dictionary
                    # If declaring BOOLEAN - insert the actual value of boolean to the booleans dictionary
                    if codes[0].getText() == "INT":
                        self.variables[var_name] = self.visit(code)
                    else:
                        self.booleans[var_name] = self.visit(code)
                        
            # Redefine existing variable   
            else:
                if i == 0: # If it's the first code block
                    # Check if the variable exists. If no, raise a warning. Otherwise, set the variable name.
                    if var_name not in self.variables and var_name not in self.booleans:
                        warnings.warn("Variable doesn't exist")
                    else:
                        var_name = var_name
                elif i == 2: # If it's the third code block
                    # If redeclaring INT - set the new value in the integers dictionary
                    # If redeclaring BOOLEAN - set the new value in the booleans dictionary
                    if var_name in self.variables:
                        self.variables[var_name] = self.visit(code)
                    else:
                        self.booleans[var_name] = self.visit(code)



    # Parse int from 'INT'
    def visitInt(self, ctx) -> int:
        return int(ctx.INT().getText())


    # Evaluate an expression
    def visitExpr(self, ctx) -> int:
        calc = logic.Calculator.Calculator()
        math_string = ""
        for child in ctx.getChildren():
            var_name = child.getText()
            if var_name in self.variables or (self.function_vars and var_name in self.function_vars[-1]):
                math_string += str(self.getVariable(var_name))
            else:
                math_string += var_name
        x = calc.evaluate(math_string)
        if x is None:
            warnings.warn(f"{math_string} is not a correct expression")
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



    
    
    # Visit Objects
    def visitObjects(self, ctx):
        if self.returnEncountered:
            return
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
                # if int go to visitExpr if boolean go to visitBool
                try:
                    expression = self.visitExpr(codes[2])
                except:
                    expression = self.visitCondition(codes[2])
                print(expression)
    

