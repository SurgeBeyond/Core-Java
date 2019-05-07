package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class BasicActions {
   	private static WebElement element;
 
   	public static void main(String[] args) {
          	try {
          		System.setProperty("webdriver.chrome.driver",
    					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                 	WebDriver driver = new ChromeDriver();
                 	driver.get("https://google.co.in");
 
                 	WebElement inputBox = driver.findElement(By.name("q"));
                 	inputBox.sendKeys("Clear this text");
                 	Thread.sleep(3000);
                 	inputBox.clear();
 
                 	inputBox = driver.findElement(By.name("q"));
                 	inputBox.sendKeys("Surgebeyond");
                 	inputBox.submit();
                 	Thread.sleep(3000);
 
                 	WebElement link = driver.findElement(By.partialLinkText("surge"));
                 	link.click();
          	} catch (Exception e) {
                 	System.out.println("Exception: " + e.getMessage());
          	}
   	}
}
