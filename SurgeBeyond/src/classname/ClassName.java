package classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class ClassName {
 
	private static WebDriver driver; 
   	private static WebElement element = null;
   	private static String text = null;
 
   	public static void main(String[] args) {
 
          	try {
          		System.setProperty("webdriver.chrome.driver",
    					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                 	driver = new ChromeDriver();
 
                 	driver.get("http://www.studydunes.com/user/users/login");
                 	element = driver.findElement(By.className("form-control"));
                 	element.sendKeys("SurgeBeyond@gmail.com"); 
                 	element.click();
          	} catch (Exception e) {
                 	System.out.println("Exception:" + e.getMessage());
          	}
   	}
}
