import sys
sys.path.append('..')
from antlr4 import *
from JailBreakLangParser import JailBreakLangParser
from JailBreakLangVisitor import JailBreakLangVisitor
from GameClass import Gameclass;



class JailBreakLang(JailBreakLangVisitor):
    def __init__(self):
        self.game = Gameclass()


    def visitStart(self, ctx):
        lines = list(ctx.getChildren())

        for i in range(len(lines) - 1):
            self.visit(lines[i])

    def visitCode(self, ctx):
        codes = list(ctx.getChildren())

        for i in range(len(codes)):
            self.visit(codes[i])

    def visitObjects(self, ctx):
        codes = list(ctx.getChildren())
        # if ctx.MAP():
        #     print("\nMAPA\n")
        test = "siur"
        match test:
            case "siur":
                print("asdf")
            case "asdffasdfas":
                print("zjebalo sie")
        # match codes[0].getText():
        #     case "MAP":
        #         print("madnasdiassjkd")

        # if codes[0].getText() == "MAP":
        #     x = int(codes[1].getText())
        #     y = int(codes[3].getText())
            
        #     self.data.map = [x, y]
        #     return self.data.map
    
    def visitMap(self, ctx):
        dimensions = ctx.dimensions.text.split(",")
        rows = int(dimensions[0])
        cols = int(dimensions[1])
        print("gowno")
        map_array = [[0 for j in range(cols)] for i in range(rows)]

        return map_array


    # def visitCommands(self, ctx: JailBreakLangParser.CommandsContext):
    #     match ctx.getText():
    #         case "IF":
                
    #         case "WHILE":
                
    #         case "FOR":
                
  
    #     return self.visitChildren(ctx)

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