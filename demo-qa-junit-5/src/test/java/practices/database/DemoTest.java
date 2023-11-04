package practices.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import utilities.readers.DatabaseReader;

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

	@Test
	@DisplayName(value = "Print <scores> Table")
	void exampleTest() {
		String query = "SELECT * FROM scores ;";
		try {
			stmt.execute("use example;");
			ResultSet set = stmt.executeQuery(query);
			ResultSetMetaData data = set.getMetaData();
			for (int i = 1; i <= data.getColumnCount(); i++) {
				String header = data.getColumnLabel(i);
				if (header.length() <= 8)
					System.out.print(header + "\t\t");
				else
					System.out.print(data.getColumnLabel(i) + "   ");
			}
			System.out.println();
			while (set.next()) {
				for (int i = 1; i <= data.getColumnCount(); i++) {
					int count = set.getString(i).length();
					if (count <= 12 && count > 4)
						System.out.print(set.getString(i) + "\t\t  ");
					else
						System.out.print(set.getString(i) + " \t  ");
				}
				System.out.println();
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@ParameterizedTest()
	@Disabled("One and Done")
	@CsvFileSource(resources = "/test_data/Example.csv", numLinesToSkip = 1)
	void fillTableTest(int studentID, String fullName, int sat_score) {
		String query = String.format("INSERT INTO scores VALUES (%d, '%s', %d);", studentID, fullName, sat_score);
		try {
			stmt.execute("use example;");
			stmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@BeforeEach
	void setup() {
		String fileName = "demo-database";
		try {
			DatabaseReader.loadDatabase(fileName);
			conn = DriverManager.getConnection(DatabaseReader.getDatabaseURL(), DatabaseReader.getUsername(),
					DatabaseReader.getPassword());
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
