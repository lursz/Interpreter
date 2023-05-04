from antlr4 import *
from antlr.JailBreakLangParser import JailBreakLangParser
from antlr.JailBreakLangVisitor import JailBreakLangVisitor
import logic.GameObjects as GameObjects
import logic.GameLogic as GameLogic
import logic.Calculator as Calculator
import warnings


class JailBreakLang(JailBreakLangVisitor):
    def __init__(self):
        self.game = GameObjects.GameObjects()
        self.variables = {}
        self.booleans = {}
    
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
                # print(list_of_commands)
                
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
            print(i, codes[i].getText())
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
        print("BOOLS: ", self.booleans)
        print("VARS: ", self.variables)



    # Parse int from 'INT'
    def visitInt(self, ctx):
        return int(ctx.INT().getText())


    # Evaluate an expression
    def visitExpr(self, ctx) -> int:
        calc = Calculator.Calculator()
        codes = list(ctx.getChildren())
        math_string = ""
        for i in range(0, len(list(ctx.getChildren()))):
            if codes[i].getText() in self.variables.keys():
                math_string += str(self.variables[codes[i].getText()])
            else:
                math_string += codes[i].getText()
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
        # print(self.booleans)
        # print(codes[0].getText())
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
            # print(condition_product.getText())
            condition_value = condition_value or self.visit(condition_product)
        # print("Wartosc: ", condition_value)
        return condition_value
    
    def visitCondition_product(self, ctx):
        codes = list(ctx.getChildren())
        
        # print("Condition product")
        if codes[0].getText() == '(':
                return self.visit(codes[1])
        if codes[0].getText() == 'NOT':
            if len(codes) > 2:
                return not self.visit(codes[2])
            return not self.visit(codes[1])
        
        condition_value = self.visit(codes[0])
        print("Codes array: ")
        print([x.getText() for x in codes])
      
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
            #print(else_index)
            if len(codes) > (else_index):
                for i in range(else_index+3, len(codes)):
                    if codes[i].getText() == '}':
                        break
                    self.visitExpressions(codes[i]) 
                #self.visitExpressions(codes[9])

        if codes[0].getText() == 'FOR':
            # TODO: FOR LOOP
            # FOR (x IN 10) { code  }
            #  0   2  3  4     7
            var_name = codes[2].getText()
            
            
            top_value = int(codes[4].getText())

            while self.variables[var_name] <= top_value:
                for code in codes[7:-1]:
                    self.visit(code)
                self.variables[var_name] += 1
            

        if codes[0].getText() == 'WHILE':
            print('WHILE')
            condition = self.visit(codes[2])

            while condition:
                for code in codes[5:-1]:
                    self.visit(code)
                condition = self.visit(codes[2])

            print(condition)



    def visitExpressions(self, ctx):
        codes = list(ctx.getChildren())
        for command in codes:
            #print('COMMAND', command.getText())
            self.visit(command)