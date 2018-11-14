package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main12 {

    static <T> void printList(List<T> src, Predicate<T> f) {
        for (T s : src) {
            if (f.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Predicate<Object> p1 = s -> s instanceof String;

        System.out.println(p1.test("11"));
        System.out.println(p1.test(1));

        List<Object> objects = new ArrayList<>();
        objects.add("Stringobj");
        objects.add(12);
        objects.add(null);
        objects.add(34.44);

        printList(objects, p1);

        Predicate<String> p2 = s -> {

            if (s instanceof String) {
                return true;
            } else {
                return false;
            }

        };
    }
}
