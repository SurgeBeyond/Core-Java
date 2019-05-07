package frames;

import java.util.Iterator;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class frames {
 
   	public static void main(String[] args) {
 
          	try {
 
          		System.setProperty("webdriver.chrome.driver",
    					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                 	WebDriver driver = new ChromeDriver();
                 	driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
          	   	
                 	List webElementList = driver.findElements(By.tagName("frame"));
                 	Iterator iterator = webElementList.iterator();
                 	
                 	System.out.println("Total numbers of frames: "+ webElementList.size());
                 	
                 	while(iterator.hasNext()){
                       	WebElement frameElement = (WebElement)iterator.next();
                       	String frameName = frameElement.getAttribute("name");
                       	System.out.println("Frame: "+ frameName);
                 	}
                 	 
          	} catch (Exception e) {
                 	System.out.println(e.getMessage());
          	}
 
   	}
}
