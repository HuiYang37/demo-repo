package practices.ui;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.TestUtils;

public class PrintPageSource {

	public static void main(String[] args) {
		printToFile(getPageSource());
	}

	private static String getPageSource() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		String page = null;
		try {
			driver.get("https://www.homedepot.com/");
			TestUtils.pause(1);
			page = driver.getPageSource();
			System.out.println("Page source captured.");
		} catch (Exception e) {
			System.out.println("Failed to capture the intended page source.");
			e.printStackTrace();
		} finally {
			driver.quit();
		}
		return page;
	}

	private static void printToFile(String page) {
		try {
			String dirPath = "./src/test/resources/page-sources";
			// create target folder if none exists
			if (!Files.exists(Paths.get(dirPath)))
				Files.createDirectory(Paths.get(dirPath));
			// copy to file
			File pageFile = new File("./src/test/resources/page-sources/webpage-" + TestUtils.getTimestamp() + ".html");
			FileWriter fw = new FileWriter(pageFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(page);

			bw.close();
			System.out.println("File created/updated.");
		} catch (Exception e) {
			System.out.println("Failed to write to file.");
			e.printStackTrace();
		}
	}

}
