package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

public class Person implements Comparable<Person> {

    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return -1;
        }

        if (age < o.age) {
            return 1;
        }

        return 0;
    }
}
