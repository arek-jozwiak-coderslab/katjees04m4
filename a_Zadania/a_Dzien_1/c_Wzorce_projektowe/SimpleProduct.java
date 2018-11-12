package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class SimpleProduct implements Product {
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
