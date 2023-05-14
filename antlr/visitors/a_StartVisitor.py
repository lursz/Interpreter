import warnings

import logic.GameLogic as GameLogic
import logic.GameObjects as GameObjects
from antlr.JailBreakLangVisitor import JailBreakLangVisitor



class JailBreakLang(JailBreakLangVisitor):
    # reducer(akcja: string, value: object):
    #     if akcja === 'CHUJ_CI_W_DUPE':
    #         return {
    #             ...variables,
    #             ...objekt
    #         }
    
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
        self.returnEncountered = False
        self.returnValue = None
        

    # Visit Start
    def visitStart(self, ctx) -> None:
        lines = list(ctx.getChildren())
        for i in range(len(lines) - 1):
            if self.returnEncountered:
                break
            self.visit(lines[i])
        
        self.returnEncountered = False
        GameLogic.Gamelogic(self.game)

    # Visit Code
    def visitCode(self, ctx) -> None:
        if self.returnEncountered:
            return
        codes = list(ctx.getChildren())

        for i in range(len(codes)):
            self.visit(codes[i])




   
