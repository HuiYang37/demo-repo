package utilities.readers;

public class DatabaseReader extends ConfigReader {

	private final static String DATABASE_FILE_NAME = "boratech-database";

	public static String getURL() {
		String key = "url";
		return (String) load(DATABASE_FILE_NAME).get(key);
	}

	public static String getDatabaseURL(String dbName) {
		String key = "url";
		return (String) load(DATABASE_FILE_NAME).get(key) + dbName;
	}

	public static String getUsername() {
		String key = "username";
		return (String) load(DATABASE_FILE_NAME).get(key);
	}

	public static String getPassword() {
		String key = "password";
		return (String) load(DATABASE_FILE_NAME).get(key);
	}

}
