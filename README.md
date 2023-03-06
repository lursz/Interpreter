# HeroLang
## Ogólne informacje
Język HeroLang powstał na zaliczenie przedmiotu Teoria Kompilacji i Kompilatory na AGH.

Głównym założeniem było stworzenie języka, który w prosty i przyjemny sposób wprowadzi młodszych użytkowników w tajniki programowania.

## Wymagania
Do poprawnego działania wymagane są:
### ```antlr4```
* ```$ python3 -m pip install -U antlr4-python3-runtime```
### ```pygame```
* ```$ python3 -m pip install -U pygame --user ```
### ```numpy```
* ```$ python3 -m pip install -U numpy --user```

## Uruchomienie
* Aby zainstalować HeroLang:
```$ pip install -i https://test.pypi.org/simple/ HeroLang -U ```
* Aby uruchomić:
 ``` 
 użycie:
 $ HeroLang plik_z_kodem plik_z_mapą tryb_wypisywania
 
 argumenty:
  plik_z_kodem            nazwa pliku z kodem w języku HeroLang
  plik_z_mapą             nazwa pliku z mapą, napisana w odpowiedniej konwencji
  tryb_wypisywania        1, jeśli w trakcie wykonywania ma być wypisywana lista wykonywanych poleceń, 0 w przeciwnym wypadku
 
 
 ```
 

## Składnia

### Sterowanie
* ``` forward ```- przechodzi o jedno pole, w kierunku, w którym patrzy
* ``` turn<kierunek> ``` - obraca się o 90° w wybranym kierunku, kierunek: ```left/right```
* ```attack``` - atakuje wroga przed sobą (musi patrzeć w tym kierunku)
* ```disarm``` - rozbraja pułapkę na polu przed sobą

### Instrukcje sterujące
* ```if<warunek>(wyrażenia)``` - instrukcja warunkowa, wykona się, jeżeli podany warunek jest prawdziwy
* ```while<warunek>(wyrażenia)``` - pętla wykonuje się tak długo, dopóki podany warunek jest prawdziwy
* ```for<liczba>(wyrażenia)``` - pętla wykonująca się podaną liczbę razy (naturalna liczba większa od 0)
* ```fun nazwa(ciało)``` - funkcja o podanej nazwie
* ```nazwa``` - wywołanie funckji o podanej nazwie

### Możliwe warunki
* ```WALL``` - true jeśli przed postacią jest ściana
* ```ENEMY``` - true jeśli przed postacią jest wróg
* ```TRAP``` -  true jeśli przed postacią jest pułapka
* ```TREASURE``` - true jeśli przed postacią jest skarb
* ```NO``` - negacja
* ```TRUE``` - zawsze zwraca true
* ```FALSE``` - zawsze zwraca false
* ```AND``` - spójnik logiczny 'i'
* ```OR``` - spójnik logiczny 'lub'
* ```[``` i ```]``` - wykorzystywane do nawiasowania warunków

### Inne
* ```PRINT<"tekst">``` - wypisuje tekst w konsoli

## Plik z mapą
Plik z mapą powinien zawierać 15 linii tesktu. W kazdej linii powinno być 15 liczb odzielonych przecinkiem. Liczby przedstawiają odpwiednie pola mapy, według następującej listy:
```
PATH = 0
HERO = 1
WALL = 2
ENEMY = 3
TRAP = 4
TREASURE = 5
 ```
Przykładowy plik z mapą:
```
2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
2, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2
2, 2, 2, 2, 4, 2, 2, 2, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 2
2, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2
2, 2, 2, 2, 0, 2, 2, 2, 2, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2
2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2
2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2
```

## Przykłady
Przykładowe pliki z kodem oraz mapami znajdują się w folderze examples. 
