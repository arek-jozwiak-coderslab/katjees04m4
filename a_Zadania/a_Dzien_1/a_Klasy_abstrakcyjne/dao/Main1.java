package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Car;
import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Train;
import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Vehicle;

public class Main1 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        Car car = new Car();
        Train train = new Train();
        vehicles[0] = car;
        vehicles[1] = train;
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }

}
