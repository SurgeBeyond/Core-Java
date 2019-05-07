package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class NavigateTest { 
   
   	private static WebDriver driver;
   	private static WebElement element = null;
   	private static String text = null;
   	
   	public static void main(String[] args) {
 
          	try {
          		System.setProperty("webdriver.chrome.driver",
    					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
                 	driver = new ChromeDriver();
 
                 	driver.navigate().to("http://www.studydunes.com/homes/index");
                 	
                 	element = driver.findElement(By.id("academic"));
                 	element.click();
 
                 	Thread.sleep(2000);
 
                 	element = driver.findElement(By.xpath(".//*[@id='onLineT']/a"));
                 	element.click();
                 	Thread.sleep(2000);
   	
                 	element = driver.findElement(By.linkText("Ques & Ans"));
                 	element.click();
                 	Thread.sleep(2000);
 
                 	driver.navigate().back();
                 	Thread.sleep(2000);
                 	
                 	driver.navigate().back();
                 	Thread.sleep(2000);
                 	
                 	driver.navigate().forward();
                 	Thread.sleep(2000);
                 	
                 	driver.navigate().forward();
                 	Thread.sleep(2000);
                 	
                 	driver.navigate().refresh(); 
          	} catch (Exception e) {
                 	System.out.println("Exception:" + e.getMessage());
          	}
   	}
}

