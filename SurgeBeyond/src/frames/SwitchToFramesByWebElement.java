package frames;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFramesByWebElement {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");

			List elementList = driver.findElements(By.tagName("frame"));

			Iterator iterator = elementList.iterator();

			WebElement webElement1 = (WebElement) iterator.next();

			WebElement webElement2 = (WebElement) iterator.next();

			WebElement webElement3 = (WebElement) iterator.next();

			driver.switchTo().frame(webElement3);

			Thread.sleep(3000);
			WebElement linkElement = driver.findElement(By.linkText("No Frames"));
			linkElement.click();
			String url = driver.getCurrentUrl();
			System.out.println(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
