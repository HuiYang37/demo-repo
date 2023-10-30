package utilities.readers;

public class DatabaseReader extends ConfigReader {

	private final static String DATABASE_FILE_NAME = "boratech-database";

	public static void loadDatabase() {
		load(DATABASE_FILE_NAME);
	}

	public static void loadDatabase(String fileName) {
		load(fileName);
	}

	public static String getDatabaseURL() {
		String key = "url";
		return get(key);
	}

	public static String getUsername() {
		String key = "username";
		return get(key);
	}

	public static String getPassword() {
		String key = "password";
		return get(key);
	}

}
