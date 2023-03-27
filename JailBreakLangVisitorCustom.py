import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarVisitor import GrammarVisitor
from Gameclass import Gameclass


class JailBreakLang(GrammarVisitor):
    def 





    # def __init__(self,game_field):
    #     self.game_field = game_field
    #     self.game_field.start()

    # def visitStart(self, ctx: GrammarParser.StartContext):
    #     statements_to_execute = []
    #     statements_to_execute = self.visit(ctx.statements)
    #     for stat in statements_to_execute:
    #         stat.execute()


    # def visitStatements(self, ctx: GrammarParser.StatementsContext):
    #     if ctx.statements is not None:
    #         statements_to_execute = self.visit(ctx.statements)
    #     statements_to_execute.append(self.visit(ctx.statement))
    #     return statements_to_execute

    # def visitStatement(self, ctx:GrammarParser.StatementContext):
    #     if ctx.if_statement():
    #         ifstatement = self.visit(ctx.if_statement())

    # def visitIf_statement(self, ctx:GrammarParser.If_statementContext):
    #     cond = self.visit(ctx.cond_help())
    #     if cond:
    #         return self.visit(ctx.statements)