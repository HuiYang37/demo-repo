package practices.database;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class BoraTechDatabaseTest extends DatabaseBaseTest {

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
	@Tag("boratech")
	void showTablesTest() {
		String queryUseTable = "use classicmodels;";
		String query = "show tables;";
		try {
			stmt.execute(queryUseTable);
			ResultSet set = stmt.executeQuery(query);
			ResultSetMetaData data = set.getMetaData();
			int num = data.getColumnCount();
			int count = 0;
			System.out.println("No. of columns: " + num);
			while (set.next()) {
				count++;
				System.out.println(set.getString(1));
			}
			System.out.println("No. of tables: " + count);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	void employeesHeaderTest() {
		String queryUseTable = "use classicmodels;";
		String query = "select * from employees;";
		try {
			stmt.execute(queryUseTable);
			ResultSet set = stmt.executeQuery(query);
			ResultSetMetaData data = set.getMetaData();
			for (int i = 1; i <= data.getColumnCount(); i++) {
				System.out.print(data.getColumnLabel(i) + ", ");
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	@Tags({@Tag("demo"), @Tag("table")})
	void employeesSelectDataTest() {
		String queryUseTable = "use classicmodels;";
		String query = "select employeeNumber, firstName, lastName, jobTitle from employees;";
		try {
			stmt.execute(queryUseTable);
			ResultSet set = stmt.executeQuery(query);
			ResultSetMetaData data = set.getMetaData();
			for (int i = 1; i <= data.getColumnCount(); i++) {
				System.out.print(data.getColumnLabel(i) + ", ");
			}
			System.out.println();
			while (set.next()) {
				System.out.println(String.format("\t%s,\t %s, %s, %s", set.getString("employeeNumber"),
						set.getString("firstName"), set.getString("lastName"), set.getString("jobTitle")));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
