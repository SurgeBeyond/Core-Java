package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryWithGoogleSearch {
	private static String URL = "http://google.com/";

	public static void main(String[] a) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(URL);

			PageFactoryMain search = new PageFactoryMain(driver);
			search.setTextAndSubmit("soarlogic.com");

		} catch (Exception e) {
			System.out.println("GoogleSearchTest Exception: " + e.getMessage());
		}
	}

}
