package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.navigate().to("https://google.com");

			WebElement searchButton = driver.findElement(By.name("btnK"));
			String colorValueInRGB = searchButton.getCssValue("color");
			System.out.println(colorValueInRGB);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
