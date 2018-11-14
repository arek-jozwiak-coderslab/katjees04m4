package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.List;

public class Main1 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        printList(list, new NumberFilter());
        printList(list, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        });

        Filter<Integer> f = new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        };
        printList(list, f);

        printList(list, e -> {
            return e < 20;
        });
        printList(list, e -> e > 20);
        printList(list, e -> e < 120);
        printList(list, e -> e < 22220);

    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }
}
