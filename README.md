# JailBreakLang
## Ogólne informacje
Język JailBreakLang pozwala programiście na utworzenie prostych plansz do gier, razem z przeszkodami oraz programowalnymi przeciwnikami. Motywem gry jest ucieczka z więzienia.

Język ma na celu w przyjemny sposób wprowadzić użytkowników w tajniki programowania, jednocześnie pozwalająć bardziej kreatywnym twórcom wykazać się w tworzeniu poziomów.

Gotową planszę można od razu przetestować oraz przejść.

## Wymagania
Do poprawnego działania wymagane są:
### ```antlr4```
* ```$ python3 -m pip install -U antlr4-python3-runtime```
### ```numpy```
* ```$ python3 -m pip install -U numpy```


## Składnia

### Mapa
* ``` MAP ```- wielkość mapy
* ``` PLAYER ```- pozycja startowa gracza
* ``` EXIT ``` - pozycja wyjścia

### Obiekty
* ``` WALL ``` - obiekt bramy
* ``` GUARD ``` - obiekt strażnika
* ``` TRAP ``` - obiekt pułapki
* ``` KEY ``` - obiekt klucza do bramy
* ``` GATE ``` - obiekt bramy


### Instrukcje sterujące
* ```IF(warunek){wyrażenia}``` - instrukcja warunkowa, wykona się, jeżeli podany warunek jest prawdziwy
* ```WHILE(warunek){wyrażenia}``` - pętla wykonuje się tak długo, dopóki podany warunek jest prawdziwy
* ```FOR(int){wyrażenia}``` - pętla wykonująca się podaną liczbę razy (naturalna liczba większa od 0)
* ```FUN nazwa{ciało}``` - funkcja o podanej nazwie
* ```nazwa``` - wywołanie funkcji o podanej nazwie
* ```RANDOM(start, end)``` - zwraca pseudorandomowa liczbę z podanego zakresu (włącznie)

### Sterowanie strażnikiem
* ```DIRECTION``` - 0 oznacza do góry, 1 w prawo, 2 w dół, 3 w lewo, inne wartości są podmieniane na resztę z dzielenia przez 4
* ```TURNLEFT``` - obróć strażnika w lewo (równoważne ze zmniejszeniem DIRECTION o 1)
* ```TURNRIGHT``` - obróć strażnika w prawo (równoważne ze zwiększeniem DIRECTION o 1)
* ```STEP``` - sprawia, że strażnik poruszy się do przodu o jedno pole

### Możliwe warunki
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
o = gracz
O = strażnik
! = pułapka
* = klucz
$ = brama
X = wyjście
 ```
Przykładowy plik z mapą:
```
##########
#o,,,,,,,#
#,,,,,,,,#
#,,,!,,,,#
#,,,O,,,,#
#,,,,!,,$X
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

start: COMMENT* 'MAP' '=' INT ',' INT
       'PLAYER' '=' INT ',' INT
       'EXIT' '=' INT ',' INT kod*;

kod:  obiekty
    | instrukcje_warunkowe
    | deklaracja_funkcji
    | COMMENT;

obiekty:  'WALL' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
        | 'TRAP' '=' (INT | ID | RAND) ',' (INT | ID | RAND)
        | 'KEY' '=' (INT | ID) ',' (INT | ID)
        | 'GATE' '=' (INT | ID) ',' (INT | ID)
        | 'GUARD' '=' (INT | ID) ',' (INT | ID) ',' INT kod*
        'GUARD' INT '{' kod_straznika* '}';

instrukcje_warunkowe: 'IF' '(' warunek ')' '{' wyrazenia* '}'
                    | 'WHILE' '(' warunek ')' '{' wyrazenia* '}'
                    | 'FOR' '(' ID 'IN' INT ')' '{' wyrazenia* '}'
                    | ID ('(' ID (',' ID)* ')')*;

deklaracja_funkcji: 'FUN' ID ('(' ID (',' ID)* ')')* '{' wyrazenia* '}';

wyrazenia: obiekty
         | instrukcje_warunkowe_2;

instrukcje_warunkowe_2: 'IF' '(' warunek ')' '{' wyrazenia* '}'
            | 'WHILE' '(' warunek ')' '{' wyrazenia* '}'
            | 'FOR' '(' ID 'IN' INT ')' '{' wyrazenia* '}'
            | ID ('(' ID (',' ID)* ')')*;   

kod_straznika: instrukcje_warunkowe_3
             | sterowanie_straznikiem;

instrukcje_warunkowe_3: 'IF' '(' warunek ')' '{' kod_straznika* '}'
            | 'WHILE' '(' warunek ')' '{' kod_straznika* '}'
            | 'FOR' '(' ID 'IN' INT ')' '{' kod_straznika* '}'
            | ID ('(' ID (',' ID)* ')')*;  

sterowanie_straznikiem: 'DIRECTION' '=' (INT | ID)
                      | 'TURNLEFT'
                      | 'TURNRIGHT'
                      | 'STEP';

warunek: 'IFWALL'
        | 'IFDIRECTION' '=' (INT | ID)
        | 'IFGUARD'
        | 'IFTRAP'
        | 'IFGATE'
        | 'NO' warunek
        | 'TRUE'
        | 'FALSE'
        | warunek 'AND' warunek
        | warunek 'OR' warunek
        | '(' warunek ')';

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

# następnie inne obiekty
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
</details>

## Interakcja
* ``` wasd ```- przechodzi o jedno pole
