package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {

	public static WebDriver driver;
	public static WebElement source, target;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://jqueryui.com/droppable/");

			driver.switchTo().frame(0);
			source = driver.findElement(By.id("draggable"));
			target = driver.findElement(By.id("droppable"));

			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
