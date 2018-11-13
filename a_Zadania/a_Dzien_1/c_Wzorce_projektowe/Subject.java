package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

}