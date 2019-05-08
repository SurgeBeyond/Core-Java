package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	
	private static WebDriver driver;
	private static String URL = "http://www.studydunes.com/homes/index";

	private static WebElement element = null;
	private static String text = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.studydunes.com/homes/index");
			
			element = driver.findElement(By.linkText("Ques & Ans"));
			element.click();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
