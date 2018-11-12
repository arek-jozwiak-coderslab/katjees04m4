<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Java Zaawansowane - Strumienie


#### Zadanie 1 - rozwiązywane z wykładowcą.

1. Napisz program, który przy wykorzystaniu strumieni danych, dla podanej listy obiektów typu `String`:

- wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające się na literę „a” lub „s”, posortowane alfabetycznie 
- zwróci listę, która powstanie poprzez wybranie z listy unikalnych łańcuchów o długości równej 5
- utworzy obiekt typu `String`, zbudowany z posortowanych elementów listy ograniczonych do 3 pierwszych znaków każdego elementu, oddzielonych przecinkami

#### Zadanie 2 - rozwiązywane z wykładowcą.

2. Napisz program, który będzie posiadał klasę reprezentującą pracownika `Employee`, zawierającą atrybuty takie jak `imię`, `nazwisko`, `płeć`, `data urodzenia`, `wysokość wynagrodzenia`.
 Utwórz kilka obiektów klasy `Employee`, a następnie:
- wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”
- wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat
- daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł. 

#### Zadanie 3
1. Na podstawie podanej listy:
````java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
````
utwórz listę, której elementy będą spełniać następujące warunki:
- kwadrat wartości pomniejszony o 5 będzie mniejszy od 20,
wykorzystaj gotowe wyrażenia lambda:
````
n -> n * n - 5
````
oraz:
````
n -> n < 20
````

#### Zadanie 4

1. Stwórz listę elementów typu `String`, następnie utwórz strumień, który:
- wypisze na konsoli długości elementów listy
- zwróci listę posortowaną alfabetycznie 
- wypisze na konsoli elementy, które zawierają literę „c”
- zwróci sumę długości wszystkich elementów
- zwróci 3 pierwsze elementy posortowane alfabetycznie 


**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
