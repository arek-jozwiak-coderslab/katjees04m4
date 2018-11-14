package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main11 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a1aaa");
        list.add("a2aaa");
        list.add("cssss");
        list.add("avvvvvvv");


        list.stream().filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(s->s.toUpperCase())
                .sorted().forEach(s->System.out.println(s));

        List<String> results = list.stream()
                .filter(s->s.length()==5)
                .distinct()
                .collect(Collectors.toList());

        String result3 = list.stream().sorted().map(s->s.substring(0,3))
                .collect(Collectors.joining(","));


    }
}
