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
                rows = int(codes[2].getText())
                cols = int(codes[4].getText())
                self.game.createMap(rows, cols)
                #return map_array
                return
            case "PLAYER":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                self.game.createPlayer(row, col)
                return row, col
            case "EXIT":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                self.game.createExit(row, col)
                return row, col
            case "WALL":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                self.game.createWall(row, col)
                return row, col
            case "TRAP":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                self.game.createTrap(row, col)
                return row, col
            case "KEY":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                self.game.createKey(row, col)
                return row, col
            case "GATE":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                self.game.createGate(row, col)
                return row, col
            case "GUARD":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
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
            
            
    # Visit number 
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
                    if codes[i].getText() in self.variables.keys():
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
        print(self.variables)

    def visitInt(self, ctx):
        return int(ctx.INT().getText())

    def visitExpr(self, ctx):
        calc = Calculator.Calculator()
        codes = list(ctx.getChildren())
        math_string = ""
        for i in range(0, len(list(ctx.getChildren()))):
            if codes[i].getText() in self.variables.keys():
                math_string += str(self.variables[codes[i].getText()])
            else:
                math_string += codes[i].getText()
        return calc.evaluate(math_string)
        
   
            
