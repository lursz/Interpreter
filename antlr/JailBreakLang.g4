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
    | 'EXIT' '=' expr ',' expr
	| 'PRINT' '(' expr ')';


// INT DECLARATION
variables: 'INT' ID '=' expr
		   | ID '=' expr
		   | 'BOOLEAN' ID '=' condition;

comparison: expr (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN) expr;

expr: term ((ADD | SUB) term)*;

term: factor ((MUL | DIV) factor)*;

factor: ID | INT | LPAREN expr RPAREN;


// COMMANDS
commands:
	'IF' '(' condition ')' '{' expressions* '}' ('ELSE' '{' expressions* '}')?
	| 'WHILE' '(' condition ')' '{' expressions* '}'
	| 'FOR' '(' ID 'IN' expr ')' '{' expressions* '}'
	| ID ('(' ID (',' ID)* ')')?;
	//FOR (x IN 10) {*code*}

// FUNCTIONS
function_declaration:
	'FUN' ID ('(' ID (',' ID)* ')')? '{' expressions* '}';

expressions: objects | commands | variables;


// GUARD
guard_extra_code: commands | guard_control;

guard_control:
	'LEFT'
	| 'RIGHT'
	| 'UP'
	| 'DOWN';

// BOOLEANS
value_comparison: expr (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN) expr;

booleanValue : 'TRUE'
	| 'FALSE'
	| value_comparison
	| variable_value
	;

variable_value: ID;

condition :                
	| condition_product ('OR' condition)*
	;      

condition_product : '(' condition ')'
	| booleanValue ('AND' condition_product)*
	| booleanValue (EQUALS condition_product)*
	| booleanValue (NOT_EQUALS condition_product)*
	| 'NOT' booleanValue
	| 'NOT' '(' condition ')'
	;	


EQUALS : '==' ;
NOT_EQUALS : '!=' ;
LESS_THAN : '<' ;
GREATER_THAN : '>' ;
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