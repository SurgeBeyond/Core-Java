package xpath;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathAxesMethodFollowing {

	private static WebDriver driver;
	private static WebElement element = null;
	private static Select select;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.studydunes.com/user/users/registration");

			element = driver.findElement(By.xpath("//input[@id='UserName']//following::select"));
			select = new Select(element);
			List<WebElement> list = select.getOptions();

			Iterator iterator = list.iterator();

			while (iterator.hasNext()) {
				System.out.println(( (WebElement) iterator.next()).getText());
			}

			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
