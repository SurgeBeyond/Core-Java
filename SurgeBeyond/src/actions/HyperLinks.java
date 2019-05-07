package actions;


import java.util.Iterator;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class HyperLinks {
   	private static WebElement element;
 
   	public static void main(String[] args) {
          	try {
          		System.setProperty("webdriver.chrome.driver",
    					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                 	WebDriver driver = new ChromeDriver();
                 	driver.manage().window().fullscreen();
                 	driver.get("http://studydunes.com/");
 
                 	WebElement tagElement = driver.findElement(By.tagName("a"));
                 	System.out.println(tagElement.getAttribute("href"));
                 	
                 	List listOfWebElements = driver.findElements(By.tagName("a"));
                 	Iterator iterator = listOfWebElements.iterator();
                 	
                 	while(iterator.hasNext()){
                       	WebElement element = (WebElement) iterator.next();
                       	System.out.println(element.getAttribute("href"));
                 	}
          	} catch (Exception e) {
                 	System.out.println("Exception: " + e.getMessage());
          	}
   	}
}
