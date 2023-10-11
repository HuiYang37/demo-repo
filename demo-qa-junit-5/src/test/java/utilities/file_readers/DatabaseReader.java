package utilities.file_readers;

public class DatabaseReader extends Reader {

	public static String getURL() {
		String key = "url";
		return (String) loadProperties("database").get(key);
	}

	public static String getDatabaseURL(String dbName) {
		String key = "url";
		return (String) loadProperties("database").get(key) + dbName;
	}

	public static String getUsername() {
		String key = "username";
		return (String) loadProperties("database").get(key);
	}

	public static String getPassword() {
		String key = "password";
		return (String) loadProperties("database").get(key);
	}

}
