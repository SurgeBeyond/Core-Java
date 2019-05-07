package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteAndRelativeXPath {

	private static WebDriver driver;
	private static WebElement element = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();

			driver.get("http://www.studydunes.com/homes/index");
			// Absolute Path
			element = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[11]/a[1]"));
			element.click();
			
			Thread.sleep(2000);
			
			driver.get("http://www.studydunes.com/homes/index");
			// Relative Path
			element = driver.findElement(By.xpath("//a[contains(text(),'Join Free')]"));
			element.click();
			
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
