package a_Zadania.a_Dzien_1.c_Wzorce_projektowe;

public class AppConfig {
    private static AppConfig INSTANCE;

    public static final String DB_NAME = "some";

    private AppConfig() {
    }

    public static AppConfig getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new AppConfig();
        }
        return INSTANCE;
    }
}
