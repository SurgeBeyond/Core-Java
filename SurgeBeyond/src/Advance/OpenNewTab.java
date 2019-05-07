package Advance;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {

	public static String driverPath = "C:\\Users\\u0119284\\Downloads\\chromedriver_win32\\";
	public static WebDriver driver;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.seleniumhq.org/");
			
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
			driver.findElement(By.linkText("Projects")).sendKeys(selectLinkOpeninNewTab);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
