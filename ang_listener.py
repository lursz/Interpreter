import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarListener import GrammarListener
import Gameclass


class HeroListener(GrammarListener):
    def __init__(self, output, game_field):
        self.output = output
        self.game_field = game_field
        # self.tasks_to_do = []
        game_field.start()

    def exitAction(self, ctx: GrammarParser.ActionContext):
        action = ctx.getText()

    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        cond = ctx.cond_help()

