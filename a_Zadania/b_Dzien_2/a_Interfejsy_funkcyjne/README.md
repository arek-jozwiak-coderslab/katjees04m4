<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Interfejsy funkcyjne &ndash; zadania

 
#### Zadanie 1 - rozwiązywane z wykładowcą
1. Utwórz interfejs funkcyjny:
````
@FunctionalInterface
public interface Filter<V> {

	boolean check(V v);
}
````
2. Utwórz klasę `Main1` a w niej statyczną metodę:
````
static <T> void printList(List<T> src, Filter<T> f) {
    for (T s : src) {
        if (f.check(s)) {
            System.out.println(s);
        }
    }
}
````

3. Utwórz klasę `NumberFilter` implementującą interfejs `Filter `
 wraz z implementacją metody `check` w następujący sposób:
````
public boolean check(Integer v) {
    return v < 20;
}
````

4. W metodzie main klasy `Main1` wywołaj metodę `printList` wykorzystując:
 - obiekt klasy `NumberFilter`
 - klasę anonimową
 - wyrażenie lambda (szczegółowo wyrażenia zostaną omówione w następnym module,
  istotne jest zobrazowanie uproszczenia kodu)
 
#### Zadanie 2

1. Utwórz interfejs funkcyjny:
````
@FunctionalInterface
public interface Transform<T, S> {

	T transform(S s);
}
````

2. Utwórz klasę `Main2` a w niej statyczną metodę:
````
static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
    for (S s : src) {
        if (f.check(s)) {
            System.out.println(t.change(s));
        }
    }
}
````

3. Utwórz klasę `NumberTransform` implementującą interfejs `Transform` wraz z implementacją metody `transform`, zwróci wartość pomniejszoną o 1. 

4. W metodzie main klasy `Main2` wywołaj metodę `printList` wykorzystując:
 - obiekt klasy `NumberFilter`
 - klasę anonimową
 
 
#### Zadanie 3

1. Korzystając z utworzonych interfejsów utwórz klasę `Main3` a w niej statyczną metodę o sygnaturze:
````
static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t)
```` 
2. Metoda ma zwracać elementy listy `src`, spełniające warunek określony w implementacji interfejsu `Filter` i przekształcone przez metodę implementującą interfejs `Transform`.

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

