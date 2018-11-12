package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public interface ParentMen {

    void run();

    default void jump(){
        System.out.println("jump");
    }
}
