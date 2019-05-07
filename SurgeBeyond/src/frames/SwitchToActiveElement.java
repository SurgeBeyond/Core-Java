package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {
	private static WebElement element;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.co.in");

			Thread.sleep(3000);
			element = driver.switchTo().activeElement();
			element.sendKeys("One World, One Nation");
			element.submit();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
