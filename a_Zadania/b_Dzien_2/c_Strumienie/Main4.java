package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main4 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        int sum = list.stream().mapToInt(s->s.length())
                .sum();
        System.out.println(sum);


        Consumer<String> cons2 = e-> System.out.println(e);

        Consumer<String> cons = System.out::println;

        cons.accept("aa");
        cons2.accept("bb");


        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            integerList.add(i);
        }
        integerList.stream().parallel()
                .forEach(System.out::println);

    }
}
