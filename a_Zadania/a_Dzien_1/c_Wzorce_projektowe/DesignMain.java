package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Car;
import a_Zadania.a_Dzien_1.b_Interfejsy.StandardUrl;

public class DesignMain {

    public static void main(String[] args) {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();

        System.out.println(simpleSingleton);

        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();

        System.out.println(simpleSingleton2);

        System.out.println(new StandardUrl());
        System.out.println(new StandardUrl());
    }
}
