package configurations;

public class Configuration {

	public static void main(String[] args) {
//		GoogleConfig.update("url", "https://www.google.com/");
		GoogleConfig.printProperties();
		GoogleConfig.update("search term", "womens shoes");
		GoogleConfig.printProperties();
		System.out.println(GoogleConfig.get("url"));
	}

}
