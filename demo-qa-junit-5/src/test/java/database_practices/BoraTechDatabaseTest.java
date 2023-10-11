package database_practices;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class BoraTechDatabaseTest extends BaseTest {

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
	void showTablesTest() {
		String queryUseTable = "use classicmodels;";
		String query = "show tables;";
		try {
			stmt.execute(queryUseTable);
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

}
