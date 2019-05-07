package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWithoutPOM {
	private WebDriver driver;
	private static WebElement element;
	private static String title;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://google.com/");

			// Object Repository
			WebElement inputBox = driver.findElement(By.name("q"));

			// Operation
			inputBox.sendKeys("SurgeBeyond");
			inputBox.submit();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
