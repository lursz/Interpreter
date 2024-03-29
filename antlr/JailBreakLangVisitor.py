# Generated from JailBreakLang.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .JailBreakLangParser import JailBreakLangParser
else:
    from JailBreakLangParser import JailBreakLangParser

# This class defines a complete generic visitor for a parse tree produced by JailBreakLangParser.

class JailBreakLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JailBreakLangParser#start.
    def visitStart(self, ctx:JailBreakLangParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#code.
    def visitCode(self, ctx:JailBreakLangParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#objects.
    def visitObjects(self, ctx:JailBreakLangParser.ObjectsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#argument.
    def visitArgument(self, ctx:JailBreakLangParser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#variables.
    def visitVariables(self, ctx:JailBreakLangParser.VariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#comparison.
    def visitComparison(self, ctx:JailBreakLangParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#expr.
    def visitExpr(self, ctx:JailBreakLangParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#term.
    def visitTerm(self, ctx:JailBreakLangParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#factor.
    def visitFactor(self, ctx:JailBreakLangParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#commands.
    def visitCommands(self, ctx:JailBreakLangParser.CommandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#expressions.
    def visitExpressions(self, ctx:JailBreakLangParser.ExpressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#function_declaration.
    def visitFunction_declaration(self, ctx:JailBreakLangParser.Function_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#fun_type.
    def visitFun_type(self, ctx:JailBreakLangParser.Fun_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#var_type.
    def visitVar_type(self, ctx:JailBreakLangParser.Var_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#fun_expressions.
    def visitFun_expressions(self, ctx:JailBreakLangParser.Fun_expressionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#return.
    def visitReturn(self, ctx:JailBreakLangParser.ReturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#fun_commands.
    def visitFun_commands(self, ctx:JailBreakLangParser.Fun_commandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#use_fun.
    def visitUse_fun(self, ctx:JailBreakLangParser.Use_funContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#guard_extra_code.
    def visitGuard_extra_code(self, ctx:JailBreakLangParser.Guard_extra_codeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#guard_control.
    def visitGuard_control(self, ctx:JailBreakLangParser.Guard_controlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#value_comparison.
    def visitValue_comparison(self, ctx:JailBreakLangParser.Value_comparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#booleanValue.
    def visitBooleanValue(self, ctx:JailBreakLangParser.BooleanValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#variable_value.
    def visitVariable_value(self, ctx:JailBreakLangParser.Variable_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#condition.
    def visitCondition(self, ctx:JailBreakLangParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JailBreakLangParser#condition_product.
    def visitCondition_product(self, ctx:JailBreakLangParser.Condition_productContext):
        return self.visitChildren(ctx)



del JailBreakLangParser