package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class SimpleSingleton {

    private static SimpleSingleton INSTANCE;
    private SimpleSingleton() {
    }
    public static SimpleSingleton getInstance() {
        if(INSTANCE == null) {
            System.out.println("TWORZE OBIEKT");
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }
}
