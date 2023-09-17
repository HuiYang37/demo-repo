package automation.utilities;

import java.util.List;

import org.openqa.selenium.WebElement;

public class DataManager {

	private static ThreadLocal<DataManager> threadLocalDataManager;

	private String token;
	private List<String> texts;
	private WebElement element;

	private DataManager() {
	}

	public static DataManager getInstance() {
		if (threadLocalDataManager == null)
			threadLocalDataManager = new ThreadLocal<>();
		if (threadLocalDataManager.get() == null) {
			threadLocalDataManager.set(new DataManager());
		}
		return threadLocalDataManager.get();
	}

	public static void reset() {
		threadLocalDataManager.set(null);
	}

	public String getToken() {
//		assertNotNull(token, "Login token is not available");
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setTexts(List<String> texts) {
		this.texts = texts;
	}

	public WebElement getElement() {
//		assertNotNull(element, "No such element existed.");
		return element;
	}

	public void setElement(WebElement element) {
		this.element = element;
	}

}
