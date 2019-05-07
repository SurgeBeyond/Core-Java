package frames;

import java.util.Iterator;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SwitchToFramesById {
 
   	public static void main(String[] args) {
 
          	try {
          		System.setProperty("webdriver.chrome.driver",
    					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                 	WebDriver driver = new ChromeDriver();
                 	driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
 
        			Thread.sleep(3000);
        			driver.switchTo().frame(0);
                 	driver.findElement(By.linkText("java.awt")).click();
 
                 	Thread.sleep(3000);
        			driver.switchTo().parentFrame();
                 	driver.switchTo().frame(1);
                 	driver.findElement(By.linkText("ActiveEvent")).click();
 
                 	driver.switchTo().defaultContent();
                 	driver.switchTo().frame(2);
                 	String title = driver.getTitle();
          	} catch (Exception e) {
                 	System.out.println(e.getMessage());
          	}
   	}
}

