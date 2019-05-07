package window;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SwitchToWindowUsingHandles {
 
      	public static void main(String[] args) {
 
               	try {
               		System.setProperty("webdriver.chrome.driver",
        					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                         	WebDriver driver = new ChromeDriver();
                         	driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
 
                         	Set windowsSet = driver.getWindowHandles();
                         	Iterator iterator = windowsSet.iterator();
                         	String window;
 
                         	while (iterator.hasNext()) {
                                  	window = (String) iterator.next();
                                  	driver.switchTo().window(window);
                                  	System.out.println("Title: "+driver.getTitle());
                         	}

               	} catch (Exception e) {
                         	System.out.println(e.getMessage());
               	}
      	}
}
