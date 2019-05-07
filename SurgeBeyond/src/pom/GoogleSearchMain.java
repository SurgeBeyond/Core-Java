package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchMain {

	public static void main(String[] a) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			GoogleSearchAndOperation search = new GoogleSearchAndOperation(driver);
			//Operation 1
			search.setTextAndSubmit("Surge Beyond");
			//Operation 2
			search.setTextAndSubmit("One World, One nation");
		} catch (Exception e) {
			System.out.println("GoogleSearchTest Exception: " + e.getMessage());
		}
	}

}
