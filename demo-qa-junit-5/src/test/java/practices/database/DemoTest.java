package practices.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilities.readers.ConfigReader;

public class DemoTest {

	private Connection conn;
	private Statement stmt;

	@Test
	void showDBTest() {
		String query = "show databases;";
		try {
			ResultSet set = stmt.executeQuery(query);
			ResultSetMetaData data = set.getMetaData();
			int num = data.getColumnCount();
			System.out.println(num);
			while (set.next())
				System.out.println(set.getString(1));
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@BeforeEach
	void setup() {
		try {
			conn = DriverManager.getConnection(ConfigReader.load("demo-database").getProperty("url"),
					ConfigReader.load("demo-database").getProperty("username"),
					ConfigReader.load("demo-database").getProperty("password"));
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@AfterEach
	void cleanup() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}