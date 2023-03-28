import sys
from antlr4 import *
from antlr.JailBreakLangLexer import JailBreakLangLexer
from antlr.JailBreakLangParser import JailBreakLangParser
from antlr.JailBreakLangVisitor import JailBreakLangVisitor


def main(argv):
    input = FileStream(argv[1])
    lexer =  JailBreakLangLexer(input)
    stream = CommonTokenStream(lexer)
    parser = JailBreakLangParser(stream)
    tree = parser.chat()

    output = open("output.txt", "w", encoding='utf-8')

    #   htmlChat = HtmlChatListener(output)
    #   walker = ParseTreeWalker()
    #   walker.walk(htmlChat, tree)

    v = JailBreakLangVisitor()
    v.visit(tree)

    output.close()


if __name__ == '__main__':
    main(sys.argv)