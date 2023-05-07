# JailBreakLang
## About
The JailBreakLang language enables a programmer to create simple game boards, complete with obstacles and programmable enemies. The game's theme is centered around escaping from a prison.

The language aims to introduce users to the intricacies of programming in an enjoyable manner, while also allowing more creative developers to showcase their skills in level creation.

Once completed, the game board can be immediately tested and completed.

## Run
Install Python3 (ver >= 3.10.8), then install all dependencies from `requirements.txt`
```
pip install requirements.txt
```

__________________________________________
## Syntax

### Map
* ``` MAP ```- size of the map
* ``` PLAYER ```- starting position of the player
* ``` EXIT ``` - position of the exit

### Objects
* ``` WALL ``` - object representing a wall
* ``` GUARD ``` - object representing a guard
* ``` TRAP ``` - object representing a trap
* ``` KEY ``` - object representing a key to unlock a gate
* ``` GATE ``` - object representing a gate


### Control Instructions
* ```IF(warunek){wyrażenia}``` - conditional instruction, will execute if the given condition is true
* ```WHILE(warunek){wyrażenia}``` - loop executes as long as the given condition is true
* ```FOR(int){wyrażenia}``` - loop that executes a specified number of times (a natural number greater than 0)
* ```FUN nazwa{ciało}``` - function with the given name
* ```nazwa``` - call a function with the given name
* ```RANDOM(start, end)``` - returns a pseudorandom number within the given range (inclusive)

### Guard Controls
* ```DIRECTION``` - 0 oznacza do góry, 1 w prawo, 2 w dół, 3 w lewo, inne wartości są podmieniane na resztę z dzielenia przez 4
* ```TURNLEFT``` - obróć strażnika w lewo (równoważne ze zmniejszeniem DIRECTION o 1)
* ```TURNRIGHT``` - obróć strażnika w prawo (równoważne ze zwiększeniem DIRECTION o 1)
* ```STEP``` - sprawia, że strażnik poruszy się do przodu o jedno pole

### Possible Conditions
* ```IFWALL``` - true jeśli przed postacią jest ściana
* ```IFGUARD``` - true jeśli przed postacią jest wróg
* ```IFTRAP``` -  true jeśli przed postacią jest pułapka
* ```IFGATE```- true jeśli brama wymaga klucza
* ```NO``` - negacja
* ```TRUE``` - zawsze zwraca true
* ```FALSE``` - zawsze zwraca false
* ```AND``` - spójnik logiczny 'i'
* ```OR``` - spójnik logiczny 'lub'
* ```(``` i ```)``` - wykorzystywane do nawiasowania warunków


## Mapa
Gotowa do gry mapa jest wynikiem kompilacji kodu. Odpowiednie symbole będą reprezentować poszczególne obiekty.
```
, = ziemia
# = ściana
O = gracz
8 = strażnik
! = pułapka
* = klucz
G = brama
E = wyjście
 ```
Przykładowy plik z mapą:
```
##########
#O,,,,,,,#
#,,,,,,,,#
#,,,!,,,,#
#,,,8,,,,#
#,,,,!,,GE
######,,,#
#,,,,,,,,#
#*,,,,,,,#
##########
```




### Gramatyka


<details>
<summary>ANTLR4</summary>
</br> 

```g4
grammar JailBreakLang;

start: code+ EOF;

code: objects | commands | function_declaration;

objects:
	'WALL' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
	| 'TRAP' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
	| 'KEY' '=' (INT | ID) ',' (INT | ID)
	| 'GATE' '=' (INT | ID) ',' (INT | ID)
	| 'GUARD' '=' (INT | ID) ',' (INT | ID) ',' INT code* 'GUARD' INT '{' guard_extra_code* '}'
	| 'MAP' '=' INT ',' INT 
    | 'PLAYER' '=' INT ',' INT 
    | 'EXIT' '=' INT ',' INT;

commands:
	'IF' '(' condition ')' '{' expressions* '}'
	| 'WHILE' '(' condition ')' '{' expressions* '}'
	| 'FOR' '(' ID 'IN' INT ')' '{' expressions* '}'
	| ID ('(' ID (',' ID)* ')')?;

function_declaration:
	'FUN' ID ('(' ID (',' ID)* ')')? '{' expressions* '}';

expressions: objects | commands;

guard_extra_code: commands | guard_control;

guard_control:
	'DIRECTION' '=' (INT | ID)
	| 'TURNLEFT'
	| 'TURNRIGHT'
	| 'STEP';

condition:
	'IFWALL'
	| 'IFDIRECTION' '=' (INT | ID)
	| 'IFGUARD'
	| 'IFTRAP'
	| 'IFGATE'
	| 'NO' condition
	| 'TRUE'
	| 'FALSE'
	| condition 'AND' condition
	| condition 'OR' condition
	| '(' condition ')';

COMMENT: '#' ~[\r\n]* -> skip;
ID: [a-zA-Z][a-zA-Z0-9]*;
RAND: 'RANDOM' '(' INT ',' INT ')';
INT: [1-9][0-9]* | '0';
WS: [ \t\n\r]+ -> skip;
```
</details>

## Przykłady kodu
<details>
<summary>#1</summary>
</br>

```
# na początku określamy wielkość mapy, podając najpierw współrzędną X, a potem Y
MAP=5,5

# następnie dodajemy gracza i wyjście
PLAYER = 1,1
EXIT=9,5

# dopiero potem możemy dodawać inne obiekty
WALL = 1,5
WALL = 2,5
WALL = 3,5
WALL = 4,5
WALL = 5,5
WALL = 6,5

# można ułatwić sobie ustawianie dużej ilości obiektów używając pętli

# kod poniżej zrobi ściany dookoła mapy
FOR(i IN 5)
{
    WALL = 0,i
    WALL = 9,i
    WALL = i,0
    WALL = i,9
}

KEY = 2,8

GATE = 8,5

TRAP = 5,5
TRAP = 3,4

# strażnika deklarujemy przez podanie współrzędnej X, potem Y, następnie unikalnego id strażnika
GUARD = 4,4,0

# aby zadeklarować poruszanie się strażnika trzeba najpierw napisać słowo klucz GUARD, następnie id strażnika
GUARD 0 
{
    # wykonaj dwa kroki do przodu, następnie zrób obrót w prawo
    STEP
    STEP
    TURNRIGHT
    
    # jeżeli przed strażnikiem nie ma ściany, a brama została otwarta, zrób dodatkowy krok
    IF(NO IFWALL AND NO IFGATE)
    {
        STEP
    }
    
    # instrukcje te będą automatycznie zapętlane
}
# strażnik będzie się przemieszczał po każdym ruchu gracza

# losowo poruszający się strażnik
GUARD1 
{
    DIRECTION = RANDOM(0, 3)
    IF (NO WALL AND NO GATE)
    {
      STEP
    }
}
```

### Drzewo wyprowadzenia kodu:

![pobrany plik](https://user-images.githubusercontent.com/92331353/226716062-dc7a5c32-20d7-4dde-8b61-28fca4b69470.svg)
</details>



## Interakcja
* ``` wasd ```- przechodzi o jedno pole


