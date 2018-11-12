package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public abstract class Vehicle {


    public Integer maxSpeed;
    public String model;

    @Override
    public String toString() {
        return "Class : " + this.getClass().getName() + " ," +
                " model: " + this.model + ", " +
                "speed: " + this.maxSpeed;
    }
}
