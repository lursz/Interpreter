grammar JailBreakLang;

start: code+ EOF;

code: objects | commands | function_declaration | variables;

objects:
	'WALL' '=' (expr | ID | RAND) ',' (expr | ID | RAND)
	| 'TRAP' '=' (expr | ID | RAND) ',' (expr | ID | RAND)
	| 'KEY' '=' (expr | ID) ',' (expr | ID)
	| 'GATE' '=' (expr | ID) ',' (expr | ID)
	| 'GUARD' '=' (expr | ID) ',' (expr | ID) ',' expr '{' guard_extra_code* '}'
	| 'MAP' '=' expr ',' expr 
    | 'PLAYER' '=' expr ',' expr 
    | 'EXIT' '=' expr ',' expr;

// INT
variables: 'INT' ID '=' expr
		   | ID '=' expr;

expr: term ((ADD | SUB) term)*;

term: factor ((MUL | DIV) factor)*;

factor: ID | INT | LPAREN expr RPAREN;


// LOGIC
commands:
	'IF' '(' condition ')' '{' expressions* '}'
	| 'WHILE' '(' condition ')' '{' expressions* '}'
	| 'FOR' '(' ID 'IN' expr ')' '{' expressions* '}'
	| ID ('(' ID (',' ID)* ')')?;

function_declaration:
	'FUN' ID ('(' ID (',' ID)* ')')? '{' expressions* '}';

expressions: objects | commands;

guard_extra_code: commands | guard_control;

guard_control:
	'LEFT'
	| 'RIGHT'
	| 'UP'
	| 'DOWN';

condition:
	'IFWALL'
	| 'IFGUARD'
	| 'IFTRAP'
	| 'IFGATE'
	| 'NO' condition
	| 'TRUE'
	| 'FALSE'
	| condition 'AND' condition
	| condition 'OR' condition
	| '(' condition ')';

LPAREN: '(';
RPAREN: ')';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
COMMENT: '#' ~[\r\n]* -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
RAND: 'RANDOM' '(' INT ',' INT ')';
INT: [1-9][0-9]* | '0';
WS: [ \t\n\r]+ -> skip;