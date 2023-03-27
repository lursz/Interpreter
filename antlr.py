import sys
from antlr4 import *
from GrammarLexer import GrammarLexer
from GrammarParser import GrammarParser


def main(argv):
    input = FileStream(argv[1])
    lexer =  GrammarLexer(input)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.chat()

    output = open("output.txt", "w", encoding='utf-8')

    #   htmlChat = HtmlChatListener(output)
    #   walker = ParseTreeWalker()
    #   walker.walk(htmlChat, tree)

    v = HeroVisitor()
    v.visit(tree)

    output.close()


if __name__ == '__main__':
    main(sys.argv)