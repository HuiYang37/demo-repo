package practices.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import utilities.readers.DatabaseReader;

public class DatabaseBaseTest {

	Connection conn;
	Statement stmt;

	@BeforeEach
	void setup() {
		try {
			conn = DriverManager.getConnection(DatabaseReader.getURL(), DatabaseReader.getUsername(),
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
