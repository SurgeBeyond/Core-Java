package window;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowUsingHandle {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");

			System.out.println(driver.getTitle());
			String currentWindow = driver.getWindowHandle();
			driver.switchTo().window(currentWindow);
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
