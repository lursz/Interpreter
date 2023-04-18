from antlr4 import *
from antlr.JailBreakLangParser import JailBreakLangParser
from antlr.JailBreakLangVisitor import JailBreakLangVisitor
import GameObjects
import GameLogic
import Calculator
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
                    #print('test: ', i, codes[i])
                return row, col, guard_id
            
    

    
    # Declare new variable or redefine an existing one
    def visitVariables(self, ctx):
        codes = list(ctx.getChildren())
        # mode 0 - declare new variable, mode 1 - redefine existing variable
        mode = 0 if codes[0].getText() == 'INT' else 1
        var_name = ""
        for i in range(len(codes)):
            # Mode 0 - declare new variable
            if mode == 0:
                if i == 1:
                    # Dictionary
                    if codes[i].getText() in self.variables.keys() or codes[i].getText() in self.booleans.keys():
                        warnings.warn("Variable already exists")
                    else:
                        self.variables[codes[i].getText()] = 0
                        var_name = codes[i].getText()
                elif i == 3:
                    self.variables[var_name] = self.visit(codes[i])
            # Mode 1 - redefine existing variable   
            else:
                if i == 0:
                    if codes[i].getText() not in self.variables.keys():
                        warnings.warn("Variable doesn't exist")
                    else:
                        var_name = codes[i].getText()
                elif i == 2:
                    self.variables[var_name] = self.visit(codes[i])
        #print(self.variables)


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
    

    def visitBooleanValue(self, ctx):
        codes = list(ctx.getChildren())
        if codes[0] == "TRUE":
            return True
        else:
            return False

    def visitCondition(self, ctx):
        codes = list(ctx.getChildren())
        if codes[0].getText() == 'TRUE':
            return True
        else:
            return False
        if (codes[1].getText() == 'AND'):
            print(self.visit(codes[0]) and self.visit(codes[2]))
            return self.visit(codes[0]) and self.visit(codes[2])

        if (codes[1].getText() == 'OR'):
            print(self.visit(codes[0]) or self.visit(codes[2]))
            return self.visit(codes[0]) or self.visit(codes[2])
        
        for command in codes:
            print('CONDITION', command.getText())

        
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

    def visitExpressions(self, ctx):
        codes = list(ctx.getChildren())
        for command in codes:
            #print('COMMAND', command.getText())
            self.visit(command)