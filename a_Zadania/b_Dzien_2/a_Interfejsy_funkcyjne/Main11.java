package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        int n = 5;

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        // sort
        Collections.sort(list, (s1, s2) -> s2.compareToIgnoreCase(s1));
        //print
        System.out.println(list);
    }
}
