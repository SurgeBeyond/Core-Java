package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesMethodParent {

	private static WebDriver driver;
	private static WebElement parentElement = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.studydunes.com/user/users/registration");

			parentElement = driver.findElement(By.xpath("//div[@class='col-md-8']//div[1]//div[1]//ul[1]//li[8]//parent::ul"));
				System.out.println(parentElement.getTagName());			

			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
