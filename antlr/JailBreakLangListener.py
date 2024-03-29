# Generated from JailBreakLang.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .JailBreakLangParser import JailBreakLangParser
else:
    from JailBreakLangParser import JailBreakLangParser

# This class defines a complete listener for a parse tree produced by JailBreakLangParser.
class JailBreakLangListener(ParseTreeListener):

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


    # Enter a parse tree produced by JailBreakLangParser#argument.
    def enterArgument(self, ctx:JailBreakLangParser.ArgumentContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#argument.
    def exitArgument(self, ctx:JailBreakLangParser.ArgumentContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#variables.
    def enterVariables(self, ctx:JailBreakLangParser.VariablesContext):
        pass

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


    # Enter a parse tree produced by JailBreakLangParser#expressions.
    def enterExpressions(self, ctx:JailBreakLangParser.ExpressionsContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#expressions.
    def exitExpressions(self, ctx:JailBreakLangParser.ExpressionsContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#function_declaration.
    def enterFunction_declaration(self, ctx:JailBreakLangParser.Function_declarationContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#function_declaration.
    def exitFunction_declaration(self, ctx:JailBreakLangParser.Function_declarationContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#fun_type.
    def enterFun_type(self, ctx:JailBreakLangParser.Fun_typeContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#fun_type.
    def exitFun_type(self, ctx:JailBreakLangParser.Fun_typeContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#var_type.
    def enterVar_type(self, ctx:JailBreakLangParser.Var_typeContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#var_type.
    def exitVar_type(self, ctx:JailBreakLangParser.Var_typeContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#fun_expressions.
    def enterFun_expressions(self, ctx:JailBreakLangParser.Fun_expressionsContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#fun_expressions.
    def exitFun_expressions(self, ctx:JailBreakLangParser.Fun_expressionsContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#return.
    def enterReturn(self, ctx:JailBreakLangParser.ReturnContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#return.
    def exitReturn(self, ctx:JailBreakLangParser.ReturnContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#fun_commands.
    def enterFun_commands(self, ctx:JailBreakLangParser.Fun_commandsContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#fun_commands.
    def exitFun_commands(self, ctx:JailBreakLangParser.Fun_commandsContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#use_fun.
    def enterUse_fun(self, ctx:JailBreakLangParser.Use_funContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#use_fun.
    def exitUse_fun(self, ctx:JailBreakLangParser.Use_funContext):
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


    # Enter a parse tree produced by JailBreakLangParser#value_comparison.
    def enterValue_comparison(self, ctx:JailBreakLangParser.Value_comparisonContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#value_comparison.
    def exitValue_comparison(self, ctx:JailBreakLangParser.Value_comparisonContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#booleanValue.
    def enterBooleanValue(self, ctx:JailBreakLangParser.BooleanValueContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#booleanValue.
    def exitBooleanValue(self, ctx:JailBreakLangParser.BooleanValueContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#variable_value.
    def enterVariable_value(self, ctx:JailBreakLangParser.Variable_valueContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#variable_value.
    def exitVariable_value(self, ctx:JailBreakLangParser.Variable_valueContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#condition.
    def enterCondition(self, ctx:JailBreakLangParser.ConditionContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#condition.
    def exitCondition(self, ctx:JailBreakLangParser.ConditionContext):
        pass


    # Enter a parse tree produced by JailBreakLangParser#condition_product.
    def enterCondition_product(self, ctx:JailBreakLangParser.Condition_productContext):
        pass

    # Exit a parse tree produced by JailBreakLangParser#condition_product.
    def exitCondition_product(self, ctx:JailBreakLangParser.Condition_productContext):
        pass



del JailBreakLangParser