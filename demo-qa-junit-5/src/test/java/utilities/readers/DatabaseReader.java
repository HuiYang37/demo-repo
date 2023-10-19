package utilities.readers;

public class DatabaseReader extends ConfigReader {

	public static String getURL() {
		String key = "url";
		return (String) load("boratech-database").get(key);
	}

	public static String getDatabaseURL(String dbName) {
		String key = "url";
		return (String) load("boratech-database").get(key) + dbName;
	}

	public static String getUsername() {
		String key = "username";
		return (String) load("boratech-database").get(key);
	}

	public static String getPassword() {
		String key = "password";
		return (String) load("boratech-database").get(key);
	}

}
