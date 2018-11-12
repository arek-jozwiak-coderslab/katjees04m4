<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Snippety
> Krótkie kawałki kodu, które pokazują zależności, rozwiązują popularne problemy oraz pokazują jak używać niektórych funkcji.

#### Klasy abstrakcyjne, interfejsy

  * Aby zdefiniować metodę abstrakcyjną używamy słowa kluczowego **abstract**.
  * Klasa jest abstrakcyjna jeżeli posiada przynajmniej jedną metodę abstrakcyjną.
  * Aby zdefiniować interfejs używamy słowa kluczowego **interface** .
  * Z klas abstrakcyjnych nie można tworzyć obiektów.
  * Metody interfejsów są domyślnie abstrakcyjne i publiczne.
  * Pola interfejsów są domyślnie statyczne i finalne.
  * Klasa może implementować wiele interfejsów.
  
#### Przykład definicji interfejsu
````java
public interface Vehicle {
    public void drive();
    public void stop();
}  
````

#### Przykład klasy implementującej interfejs

````java
public class Bike implements Vehicle{
 
    @Override
    public void drive() { }
 
    @Override
    public void stop() { }
 
 
}  
````

#### Przykład metody domyślnej interfejsu (Java 8)
````java
public default int getPriority(){
    return 0;
} 
````

#### Przykład definicji klasy abstrakcyjnej

````java
public abstract class Vehicle {
 
	public void go() {
		this.startEngine();
	}
 
	public void stop() {
		this.stopEngine();
	}
 
	abstract void startEngine();
	abstract void stopEngine();
}
````
#### Podstawowe wbudowane interfejsy funkcyjne

- Predicate<T> - służy do testowania warunków. Metoda to -  `boolean test(T t)`
Dokumentacja:
https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
- Function<T,R> - zwraca wartość typu R, przyjmując jako argument atrybut typu T. Metoda to `R apply(T t)`
Dokumentacja:
https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
-Consumer<T> - wykonuje operacje na przekazanym atrybucie nie zwraca wartości .Metoda to `void accept(T t)`
Dokumentacja:
https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html

Lista wszystkich wbudowanych interfejsów funkcyjnych z pakietu `java.util.function`:
https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

#### Wyrażenia lambda
Ogólna składnia wyrażenia lambda przedstawia się następująco:
````
(Type1 arg2, Type2 arg2, …) -> {
	ciało wyrażenia
}

````


#### Przykład zastosowania strumieni

````java
List<String> fruits =
Arrays.asList("orange", "lemon", "peach", "banana", "plum",
    "cherry", "apple", "pomelo");
 
fruits.stream()
    .filter(s -> s.startsWith("p"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);


````

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
