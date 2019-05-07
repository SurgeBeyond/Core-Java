package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class SwitchToFramesByName {

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

			System.out.println(webElement1.getAttribute("name"));
			System.out.println(webElement2.getAttribute("name"));
			System.out.println(webElement3.getAttribute("name"));

			Thread.sleep(2000);
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("java.awt")).click();

			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("ActiveEvent")).click();

			driver.switchTo().parentFrame();
			driver.switchTo().frame("classFrame");
			String title = driver.getTitle();

			System.out.println(title.contains("ActiveEvent"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
