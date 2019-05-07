package tag;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	private static WebDriver driver;
	private static WebElement element = null;
	private static List elements = null;
	private static String titleText = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.studydunes.com/homes/index");

			elements = driver.findElements(By.tagName("a"));
			Iterator elementIterator = elements.iterator();

			while (elementIterator.hasNext()) {
				element = (WebElement) elementIterator.next();
				System.out.println(element.getText());
			}
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
