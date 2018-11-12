package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class ConcreteCreator implements Creator {
    @Override
    public Product createProduct(String type) {
        Product product = null;
        switch (type) {
            case "simple":
                product = new SimpleProduct();
                break;
            case "advanced":
                product = new AdvanceProduct();
                break;
            case "virtual":
                product = new VirtualProduct();
                break;
        }

        return product;
    }
}
