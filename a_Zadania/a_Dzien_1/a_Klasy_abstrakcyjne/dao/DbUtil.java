package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static final String DB_URL = "jdbc:mysql://localhost:3366/database_name?useSSL=false";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}
}