import sys
from antlr4 import *
from JailBreakLangParser import JailBreakLangParser
from JailBreakLangVisitor import JailBreakLangVisitor
# from Gameclass import Gameclass


class JailBreakLang(JailBreakLangVisitor):
    def visitCommands(self, ctx: JailBreakLangParser.CommandsContext):
        match ctx.getText():
            case "IF":
                
            case "WHILE":
                
            case "FOR":
                
  
        return self.visitChildren(ctx)

# ---------------------------- EXAMPLES FROM JAVA ---------------------------- #
# private List<JavaProgramCode> getNArgumentsForPattern(PatternGrammarParser.ArgumentsContext ctx, int n) {
#         List<JavaProgramCode> ans = new ArrayList<>();

#         ans.add(visitPattern(ctx.pattern()));
#         for (int i = 0; i < n - 1; i++) {
#             ctx = ctx.args_with_delim.arguments;
#             ans.add(visitPattern(ctx.pattern()));
#         }

#         return ans;
#     }

#     private JavaProgramCode createLoop(PatternGrammarParser.PatternContext ctx) {
#         List<JavaProgramCode> loopArguments = getNArgumentsForPattern(ctx.arguments, 4);

#         JavaProgramCode code = loopArguments.get(0);
#         JavaProgramCode conditionCode = loopArguments.get(1);
#         JavaProgramCode bodyCode = loopArguments.get(2);
#         JavaProgramCode followingCode = loopArguments.get(3);

#         code.appendToLastLineOfCode(";");
#         code.appendLineOfCode("while (", 0);
#         code.addCodeAsBooleanFunction(conditionCode);
#         code.appendToLastLineOfCode(") {");
#         code.appendCode(bodyCode, 1);
#         code.appendToLastLineOfCode(";");
#         code.appendLineOfCode("}", -1);
#         code.appendCode(followingCode, 0);

#         code.setAsContainingOnlyAtomicFunction(false);

#         return code;

# -------------------------------- TO CO BYLO -------------------------------- #
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