import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait; 
 
public class CreatMetaDocDescriptor {
 
         public static void main(String [] args) throws InterruptedException{
                  //System.setProperty("webdriver.ie.driver",path of executable file "IEDriverServer.exe")
                  System.setProperty("webdriver.chrome.driver", "C://Users//UX012939//Documents//FreeLance//Selenium//chromedriver_win32//chromedriver.exe");
                  //Initialize InternetExplorerDriver Instance.
                  WebDriver driver = new ChromeDriver();
                  driver.get("http://novusguidemo/");
                  driver.manage().window().fullscreen();
                  
                  String s = driver.getPageSource();
                   
                  if(s.contains("USER")) {
                  driver.findElement(By.id("USER")).sendKeys("X012939");;
                  driver.findElement(By.id("PASSWORD")).sendKeys("Retrieval@21");;
                  driver.findElement(By.id("safeLoginbtn")).submit();;
                  Thread.sleep(2000);
                  }
                  
                  Thread.sleep(5000);
                  driver.findElement(By.linkText("Easel QC")).click();
                  
                   s = driver.getPageSource();
                 if(s.contains("SAFE User ID:")) {
                 driver.findElement(By.id("USER")).sendKeys("X012939");;
                 driver.findElement(By.id("PASSWORD")).sendKeys("Retrieval@21");;
                 driver.findElement(By.id("safeLoginbtn")).submit();;
                 Thread.sleep(2000);
                 }
                  
                  WebDriverWait wait = new WebDriverWait(driver, 10);
                  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("CCI"))); 
                  

                  
                  WebElement mySelectElement = driver.findElement(By.name("groupUri"));
                  Select dropdown1= new Select(mySelectElement);
                  dropdown1.selectByVisibleText("novus");
                  Thread.sleep(2000);
                 
                  driver.findElement(By.linkText("CCI")).click();
                  
                   mySelectElement = driver.findElement(By.id("environment"));
                  Select dropdown= new Select(mySelectElement);
                  dropdown.selectByVisibleText("QC");
                  
                  WebElement Type = driver.findElement(By.name("cciType"));
                  Select type= new Select(Type);
                  type.selectByVisibleText("Domain Descriptor");
                  
                  WebElement filter = driver.findElement(By.name("fileNameFilter"));
                  filter.sendKeys("TestProd");                  
                  Thread.sleep(5000);;
                  driver.findElement(By.name("Continue")).click();
                  driver.findElement(By.linkText("TestProd")).click();;
                                   
                  int loop=103;
                  
                  while(loop++<300) {
                	  
                	  System.out.println(loop);
                  List<WebElement> images = driver.findElements(By.xpath("//img[@src='./images/add.gif']"));
                  WebElement image1=null;
                  for(WebElement image: images) {
                	  if(image.isDisplayed()) {
                	  image1 = image;
                	  System.out.println(image1.getAttribute("title"));
                	  }
                  }
                  
                  image1.click();
                  Thread.sleep(2000);
                  List<WebElement> editors =  driver.findElements(By.xpath("//div[@contenteditable='true']"));
                  WebElement ed1=null;
                  for(WebElement editor: editors) {
                	  ed1 = editor;
                  }
                  ed1.click();
                  Thread.sleep(2000);
                  ed1.sendKeys("Content"+loop);
                  Thread.sleep(2000);
                  driver.findElement(By.id("save_changes_action")).click();;
                  Thread.sleep(3000);
                  driver.switchTo().alert().accept();
                  Thread.sleep(2000);
                  }
                   driver.quit();
           }
         
}
