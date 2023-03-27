# Generated from JailBreakLang.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JailBreakLangParser import JailBreakLangParser
else:
    from JailBreakLangParser import JailBreakLangParser

# This class defines a complete generic visitor for a parse tree produced by JailBreakLangParser.

class JailBreakLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JailBreakLangParser#start.
    def visitStart(self, ctx:JailBreakLangParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#kod.
    def visitKod(self, ctx:JailBreakLangParser.KodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#obiekty.
    def visitObiekty(self, ctx:JailBreakLangParser.ObiektyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#instrukcje_warunkowe.
    def visitInstrukcje_warunkowe(self, ctx:JailBreakLangParser.Instrukcje_warunkoweContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#deklaracja_funkcji.
    def visitDeklaracja_funkcji(self, ctx:JailBreakLangParser.Deklaracja_funkcjiContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#wyrazenia.
    def visitWyrazenia(self, ctx:JailBreakLangParser.WyrazeniaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#instrukcje_warunkowe_2.
    def visitInstrukcje_warunkowe_2(self, ctx:JailBreakLangParser.Instrukcje_warunkowe_2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#kod_straznika.
    def visitKod_straznika(self, ctx:JailBreakLangParser.Kod_straznikaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#instrukcje_warunkowe_3.
    def visitInstrukcje_warunkowe_3(self, ctx:JailBreakLangParser.Instrukcje_warunkowe_3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#sterowanie_straznikiem.
    def visitSterowanie_straznikiem(self, ctx:JailBreakLangParser.Sterowanie_straznikiemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#warunek.
    def visitWarunek(self, ctx:JailBreakLangParser.WarunekContext):
        return self.visitChildren(ctx)

    


del JailBreakLangParser