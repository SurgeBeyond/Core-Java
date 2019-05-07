package xpath;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathAxesMethodDescendant {

	private static WebDriver driver;
	private static List<WebElement> descendantElements = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.studydunes.com/user/users/registration");

			descendantElements = driver.findElements(By.xpath("//div[@class='col-md-8']//div[1]//div[1]//ul[1]//descendant::li"));
			
			Iterator iterator = descendantElements.iterator();
					
			while(iterator.hasNext()) {
				System.out.println(((WebElement) iterator.next()).getTagName());
			}

			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
