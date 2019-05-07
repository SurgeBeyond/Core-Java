package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathORandAND {

	private static WebDriver driver;
	private static WebElement element = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.studydunes.com/user/users/registration");
			
			element = driver.findElement(By.xpath("//input[contains(@name,'data') and contains(@placeholder,'Screen')]"));
			element.sendKeys("Surge");
			
			driver.get("http://www.studydunes.com/user/users/registration");			
			element = driver.findElement(By.xpath("//input[contains(@id,'UserName') or contains(@placeholder, 'Screen Name')]"));
			element.sendKeys("Beyond");;
			
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
