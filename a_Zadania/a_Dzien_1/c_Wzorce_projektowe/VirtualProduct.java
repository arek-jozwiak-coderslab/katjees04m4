package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class VirtualProduct implements Product {
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
