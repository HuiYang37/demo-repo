package utilities;

public class PropertiesReader extends Reader {

	private static String filePath = "./src/test/resources/insurance.properties";

	public static String getURL() {
		load(filePath);
		return get("url");
	}

}
