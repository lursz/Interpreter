from antlr4 import *
from antlr.JailBreakLangParser import JailBreakLangParser
from antlr.JailBreakLangVisitor import JailBreakLangVisitor
import GameObjects
import GameLogic


class JailBreakLang(JailBreakLangVisitor):
    def __init__(self):
        self.game = GameObjects.GameObjects()
    
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
                #print("robie mape o wymiarach ", rows, " ", cols)
                self.game.createMap(rows, cols)
                #return map_array
                return
            case "PLAYER":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                #print("gracz na kordach ", row, " ", col)
                self.game.createPlayer(row, col)
                return row, col
            case "EXIT":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                #print("wyjscie na kordach ", row, " ", col)
                self.game.createExit(row, col)
                return row, col
            case "WALL":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                #print("sciana na kordach ", row, " ", col)
                self.game.createWall(row, col)
                return row, col
            case "TRAP":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                #print("trap na kordach ", row, " ", col)
                self.game.createTrap(row, col)
                return row, col
            case "KEY":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                #print("klucz na kordach ", row, " ", col)
                self.game.createKey(row, col)
                return row, col
            case "GATE":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                #print("gate na kordach ", row, " ", col)
                self.game.createGate(row, col)
                return row, col
            case "GUARD":
                row = int(codes[2].getText())-1
                col = int(codes[4].getText())-1
                guard_id = codes[6].getText()
                #print("straznik na kordach ", row, " ", col, " ID: ", guard_id)
                self.game.createGuard(row, col, guard_id)
                
                codes = list(ctx.getChildren())
                for i in range(len(codes)):
                    self.visit(codes[i])

                return row, col, guard_id
            
            

