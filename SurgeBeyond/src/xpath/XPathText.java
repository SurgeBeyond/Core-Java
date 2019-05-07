package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathText {

	private static WebDriver driver;
	private static WebElement element = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();			
			driver.get("http://www.studydunes.com/user/users/registration");
			
			element = driver.findElement(By.xpath("//*[text()='Screen Name']"));
			
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
