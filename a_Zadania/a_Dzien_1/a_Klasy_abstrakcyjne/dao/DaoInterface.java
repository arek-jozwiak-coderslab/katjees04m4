package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao;

import java.util.List;

public interface DaoInterface {

    List<Model> loadAll();

    Model loadById(int id);

    void save(Model object);

    void delete(Model object);

}

