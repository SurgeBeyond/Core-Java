package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://google.co.in");

			WebElement link = driver.findElement(By.partialLinkText("Gma"));
			String text = link.getText();

			System.out.println("Text: " + text);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
