package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://google.co.in");

			WebElement link = driver.findElement(By.partialLinkText("Gma"));
			boolean flag = link.isDisplayed();

			System.out.println("Link is displayed: " + flag);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
