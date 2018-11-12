<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Klasy abstrakcyjne &ndash; zadania

Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań. 
 
### Zadania rozwiązywane z wykładowcą:

#### Zadanie 1

1. Stwórz klasę abstrakcyjną o nazwie `Vehicle`. Klasa ma posiadać pola:
    * maxSpeed (`Integer`)
    * model (`String`)
2. Zdefiniuj metodę `toString`, zwracającą informacje w postaci:  
`Class : <nazwa klasy>, model: <nazwa modelu>, speed: <maksymalna prędkość>`.
3. Utwórz klasę `Car`, która dziedziczy po klasie `Vehicle`.
4. Klasa ma zawierać dodatkowe pole typu `String` o nazwie `type`, reprezentującą typ (np. terenowy, SUV) oraz dodatkowe metody dostępowe (getter, setter).
Dodaj konstruktor umożliwiający ustawienie wszystkich atrybutów klasy.
5. Utwórz klasę `Train`, która dziedziczy po klasie `Vehicle`. 
6. Klasa ma zawierać dodatkowe pole typu int o nazwie `trackWidth`, reprezentującą szerokość toru (np. 600 – kolej wąskotorowa, 1435 – standardowa szerokość) oraz dodatkowe metody dostępowe (getter, setter).
Dodaj konstruktor umożliwiający ustawienie wszystkich atrybutów klasy.
7. W klasie `main` utwórz tablicę dwóch elementów typu `Vehicle`.
8. Wstaw do tablicy elementy: pociąg oraz samochód, następnie w pętli wyświetl obiekty, wywołując metodę `toString`. 
9. Przetestuj metody w metodzie `main` klasy **Main1**.

#### Zadanie 2 - rozwiązywane z wykładowcą

1. Dla dowolnej bazy danych wywołaj polecenie `sql`, znajdujące się w pliku **dump.sql**.
2. Zmodyfikuj dane połączenia z klasy **DbUtil** oraz dołącz do projektu sterownik bazy danych.
3. Uruchom metodę `main` z klasy **Main2**.
4. Przeanalizuj działanie poszczególnych klas oraz metod z przykładu.

-----------------------------------------------------------------------------

### Zadania rozwiązywane samodzielnie:

#### Zadanie 3 

1. Utwórz klasę **Exercise** zawierającą pola:
    * private Long id;
    * private String title;
    * private String description;

2. Utwórz klasę **ExerciseDao**, analogicznie do udostępnionej w przykładzie klasy **GroupDao**.
3. Zastanów się jakie modyfikacje można wprowadzić tak, by kod był bardziej uniwersalny.     

#### Zadanie 4 - dodatkowe

1. Utwórz klasę **User** zawierającą dowolne pola użytkownika oraz połączenie z klasą **Group**.
2. Utwórz klasę **UserDao**, analogicznie do udostępnionej w przykładzie klasy **GroupDao**.

Zapoznaj się z definicją  [*metody szablonowej*][template-method] repozytorium z zadaniami.

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

<!-- Links -->
[template-method]: https://pl.wikipedia.org/wiki/Metoda_szablonowa_(wzorzec_projektowy)