package employee.crud.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static final String dbURL = "jdbc:mysql://localhost:3306/employee_db";
	public static final String dbUserName = "root";
	public static final String dbPassword = "password";

	public static Connection getConnection() {

		System.out.println("Start DB Connection"); // Logger should be used: Log4J
		try {
			// Load MySql JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open Connection
			connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);

			if (connection != null) {
				System.out.println("DB Connected!");
				return connection;
			} else {
				System.out.println("Connection Issue!");
				return null;

			}
		} catch (Exception e) {
			System.out.println("Exception in DB Connection==>" + e.getMessage());
			e.printStackTrace();
			return null;
		}

	}

	public static Connection connection = getConnection(); // static member can be called via class

	public static void main(String[] args) {
		System.out.println(DBConnection.connection);
	}

}
