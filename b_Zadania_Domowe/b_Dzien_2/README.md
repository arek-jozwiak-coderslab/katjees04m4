<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#### Zadanie 1.

1. Napisz własny interfejs funkcyjny, który będzie można wykorzystać do sprawdzenia czy podana
 jako parametr liczba całkowita mieści się w przedziale między 0 a 100.

#### Zadanie 2

1. Napisz program, który będzie zawierał metodę filterList pozwalającą na filtrowanie zawartości listy obiektów typu String.
 Metoda filterList ma przyjmować dwa argumenty – listę obiektów String, oraz referencję obiektu `Predicate`
  określający warunek filtrowania. Metoda ma zwracać listę przefiltrowanych obiektów.
Korzystając z metody filterList przefiltruj listę wybierając z niej:
- obiekty których długość jest większa niż 4
- obiekty zawierające literę „b”
- obiekty które kończą się na literę „a”

````java
 List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");
````

#### Zadanie 3
1. Korzystając z interfejsu `Function` przypisz do zmiennej **sampleText** wyrażenie lambda które dla zadanego napisu utworzy napis bez pierwszych i ostatnich 2 znaków,
zamieniony na małe znaki.

Przykład dla zadanego napisu:
````java
String sample = "CODERSLAB";
````
otrzymamy wynik

````
dersl
````

#### Zadanie 4

1. Utwórz interfejs o nazwie `Inspectionable` - określający, które z pojazdów muszą przechodzić przegląd.
2. W interfejsie dodaj metodę `void createInspection()` - metoda ma wyświetlać dane w następujący sposób:
`Model: <nazwa modelu> - sprawdzony`.
3. Zmodyfikuj klasę `Car` tak by implementowała interfejs `Inspectionable` .
4. Zmodyfikuj pętlę wyświetlającą dane o pojazdach tak by w przypadku wystąpienia obiektu który implementuje `Inspectionable`, została wykonana metoda `createInspection()`.


#### Zadanie 5

1. Utwórz metody o sygnaturach:
````
static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) 
````
metoda ma zwrócić listę elementów spełniających warunek określony w `predicate`
````
static <S, T> List<T> changeCollection(Collection<T> collection, Function<S, T> function)
````
metoda ma przekształcić elementy za pomocą `function` i dodać do nowej zwracanej kolekcji
````
static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer)
````
metoda ma przekształcić elementy za pomocą `consumer`


**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
