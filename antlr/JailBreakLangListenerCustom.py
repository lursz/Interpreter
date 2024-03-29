# Generated from JailBreakLang.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JailBreakLangParser import JailBreakLangParser
    from .JailBreakLangLexer import JailBreakLangLexer
else:
    from JailBreakLangParser import JailBreakLangParser
    from JailBreakLangLexer import JailBreakLangLexer



# This class defines a complete listener for a parse tree produced by JailBreakLangParser.
class JailBreakLangListenerCustom(ParseTreeListener):
    
    def __init__(self):
        self.declared_vars = set()

    def exitProgram(self):
        return self.declared_vars

    # Enter a parse tree produced by JailBreakLangParser#start.
    def enterStart(self, ctx:JailBreakLangParser.StartContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#start.
    def exitStart(self, ctx:JailBreakLangParser.StartContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#code.
    def enterCode(self, ctx:JailBreakLangParser.CodeContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#code.
    def exitCode(self, ctx:JailBreakLangParser.CodeContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#objects.
    def enterObjects(self, ctx:JailBreakLangParser.ObjectsContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#objects.
    def exitObjects(self, ctx:JailBreakLangParser.ObjectsContext):
        pass

    # def enterEveryRule(self, ctx):
    #     for i in ctx.getChildren():
    #         print('### ', i, ' $$$')



    # Enter a parse tree produced by JailBreakLangParser#variables.
    def enterVariables(self, ctx): 
        #print(ctx.getChildCount(), ctx.getChild(0).getText())
        if ctx.getChild(0).getText() == 'INT' or ctx.getChild(0).getText() == 'BOOLEAN':
            new_var = ctx.getChild(1).getText()
            self.declared_vars.add(new_var)

    # Exit a parse tree produced by JailBreakLangParser#variables.
    def exitVariables(self, ctx:JailBreakLangParser.VariablesContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#comparison.
    def enterComparison(self, ctx:JailBreakLangParser.ComparisonContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#comparison.
    def exitComparison(self, ctx:JailBreakLangParser.ComparisonContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#expr.
    def enterExpr(self, ctx:JailBreakLangParser.ExprContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#expr.
    def exitExpr(self, ctx:JailBreakLangParser.ExprContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#term.
    def enterTerm(self, ctx:JailBreakLangParser.TermContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#term.
    def exitTerm(self, ctx:JailBreakLangParser.TermContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#factor.
    def enterFactor(self, ctx:JailBreakLangParser.FactorContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#factor.
    def exitFactor(self, ctx:JailBreakLangParser.FactorContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#commands.
    def enterCommands(self, ctx:JailBreakLangParser.CommandsContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#commands.
    def exitCommands(self, ctx:JailBreakLangParser.CommandsContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#function_declaration.
    def enterFunction_declaration(self, ctx:JailBreakLangParser.Function_declarationContext):
        if ctx.getChild(1).getText() == 'FUN':
            vars = list(ctx.getChildren())
            for i in range(len(vars)):
                if vars[i].getText() in ['INT', 'BOOLEAN'] and vars[i+1].getText() != 'FUN':
                    self.declared_vars.add(vars[i+1].getText())
                elif vars[i].getText() in ['INT', 'BOOLEAN', 'VOID'] and vars[i+1].getText() == 'FUN':
                    self.declared_vars.add(vars[i+2].getText())
                # self.declared_vars.add(new_var)

    # Exit a parse tree produced by JailBreakLangParser#function_declaration.
    def exitFunction_declaration(self, ctx:JailBreakLangParser.Function_declarationContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#expressions.
    def enterExpressions(self, ctx:JailBreakLangParser.ExpressionsContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#expressions.
    def exitExpressions(self, ctx:JailBreakLangParser.ExpressionsContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#guard_extra_code.
    def enterGuard_extra_code(self, ctx:JailBreakLangParser.Guard_extra_codeContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#guard_extra_code.
    def exitGuard_extra_code(self, ctx:JailBreakLangParser.Guard_extra_codeContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#guard_control.
    def enterGuard_control(self, ctx:JailBreakLangParser.Guard_controlContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#guard_control.
    def exitGuard_control(self, ctx:JailBreakLangParser.Guard_controlContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#booleanValue.
    def enterBooleanValue(self, ctx:JailBreakLangParser.BooleanValueContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#booleanValue.
    def exitBooleanValue(self, ctx:JailBreakLangParser.BooleanValueContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#condition.
    def enterCondition(self, ctx:JailBreakLangParser.ConditionContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#condition.
    def exitCondition(self, ctx:JailBreakLangParser.ConditionContext):
        pass
        

class IDListenerLexer(JailBreakLangLexer):
    def nextToken(self):
        token = super().nextToken()
        if token.type == JailBreakLangLexer.ID:
            print("Found ID: " + token.text)
        return token

del JailBreakLangParser


