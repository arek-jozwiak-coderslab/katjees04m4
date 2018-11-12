<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#### Zadanie 1

1. W pliku `Main1` umieszczony został kod, który umieszcza w tablicy obiekty. Następnie wykonuje sortowanie tablicy.
2. Po uruchomieniu programu zauważysz że zwracany jest wyjątek, popraw kod dodając instrukcję `implements`
w następujący sposób:
    ````java
    public class Person implements Comparable<Person>
    ````
3. Dodaj implementację wymaganej metody, ma ona porównywać osoby względem pierwszej litery nazwiska.
4. Możesz w tym celu wykorzystać metodę klasy `String` - `compareTo`;
5. Po wprowadzeniu zmian uruchom ponownie program i zweryfikuj czy działa poprawnie.

Zapoznaj się z interfejsem -  [*Comparable*][comparable]

Pamiętaj że jeżeli operujesz na danych pobieranych z bazy danych możesz je odpowiednio sortować przy pomocy zapytania SQL.

Takiej możliwości może nie być w przypadku korzystania z API od zewnętrznego dostawcy.

#### Zadanie 2

1. W pliku `Main2` w metodzie `main` utwórz listę obiektów klasy `Person` następnie uzupełnij ją przynajmniej trzema obiektami tej klasy.
2. Wykonaj metodę `Collections.sort(lista obiektow)`.
3. Wyświetl elementy listy.

#### Zadanie 3

1. Stwórz klasę abstrakcyjną `Shape` zawierającą pola:
    * area - double (pole)
    * circuit - double (obwód)
    * color - String
2. Dodaj metody abstrakcyjne:
    * calculateArea - do obliczania powierzchni
    * calculateCircuit - do obliczania obwodu
3. Utwórz klasy pochodne `Rectangle`, `Square`, `Circle`, uzupełnij je o pola wymagane do obliczenia pola/obwodu oraz dodaj konstruktory ustawiające wszystkie pola.
4. Dodaj implementację metod w klasach pochodnych.
5. W pliku `Main3` w metodzie main utwórz listę `List<Shape> list = new ArrayList<>();`, następnie dodaj do niej po jednym obiekcie każdego pochodnego typu.
6. Wyświetl dane w postaci:
    ````html
    `Prostokąt o bokach 2 i 4 - pole = 8, obwód = 12`
    `Kwadrat o boku 2 - pole = 4, obwód = 8`
    `Koło o promieniu 3- pole = 28,27, obwód = 18,85`
    ````



**Zadania dodatkowe - są to przykładowe zadania z egzaminu OCJP - dawniej SCJP**

Spróbuj odpowiedzieć na zadane pytania - następnie uruchom kod i przeanalizuj swoją odpowiedź.

#### Zadanie 1

Given:
public interface Word {boolean isSpelled(String w); }

And three files:

1. abstract class Verb1 implements Word{boolean isSpelled(){}}
2. abstract class Verb2 implements Word{boolean isSpelled(){return true;}}
3. abstract class Verb3 implements Word{boolean isSpelled(String w){return true;}}

Which is true:
    * A. Only the first file will compile
    * B. Only the first and second files will compile.
    * C. Only the first and third will compile.
    * D. Only the second file will  compile.
    * E. All three files will compile.

#### Zadanie 2
What is the output for the below code ?
```java
interface A {
	public void printValue();
}
```

```java
public class Test {
	public static void main(String[] args) {
		A a1 = new A() {
			public void printValue() {
				System.out.println("A");
			}
		};
		a1.printValue();
	}
}
```

Options are:
   1. Compilation fails due to an error on line 3
   1. A
   1. Compilation fails due to an error on line 8
   1. null

#### Zadanie 3
What is the output for the below code ?
```java
public interface InfA {
    protected String getName();
}
public class Test implements InfA{
    public String getName(){
        return "test-name";
    }
    public static void main (String[] args){
        Test t = new Test();
        System.out.println(t.getName());
    }
}
```
Options are:
   1. test-name  
   1. Compilation fails due to an error on lines 2  
   1. Compilation fails due to an error on lines 1  
   1. Compilation succeed but Runtime Exception  

<!-- Links -->
[comparable]: https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**
