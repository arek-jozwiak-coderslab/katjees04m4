package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {

    public static void main(String[] args) {
        Supplier<Integer> sup = () -> 12;
        Predicate<String> predicate = s -> s.length() > 300;

        List<String> names = Arrays.asList("Wojtek", "Ania", "Magda", "Zosia");

        List<Person> people = new ArrayList<>();
        people.add(new Person(2));
        people.add(new Person(12));
        people.add(new Person(32));
        Collections.sort(people);

    }
}
