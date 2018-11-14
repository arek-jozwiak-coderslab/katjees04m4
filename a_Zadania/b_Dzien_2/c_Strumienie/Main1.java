package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {

    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        Arrays.stream(new int[]{1, 2, 3});

        String someText = "some text";


        fruits.stream()
                .filter(s -> {
                    return s.startsWith("p") && (s.endsWith("m") || s.endsWith("h") );
                })

                .map(s -> s.toUpperCase())
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))

                .forEach(s -> System.out.println(s))

        ;

        List<String> newList = fruits.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
    }
}
