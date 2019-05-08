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

public class AddContentType {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.ie.driver",path of executable file
		// "IEDriverServer.exe")
		System.setProperty("webdriver.chrome.driver",
				"C://Users//UX012939//Documents//FreeLance//Selenium//chromedriver_win32//chromedriver.exe");
		// Initialize InternetExplorerDriver Instance.
		WebDriver driver = new ChromeDriver();
		driver.get("http://novusguidemo/");
		driver.manage().window().fullscreen();

		String s = driver.getPageSource();

		if (s.contains("USER")) {
			driver.findElement(By.id("USER")).sendKeys("X012939");
			;
			driver.findElement(By.id("PASSWORD")).sendKeys("Retrieval@21");
			;
			driver.findElement(By.id("safeLoginbtn")).submit();
			;
			Thread.sleep(2000);
		}

		Thread.sleep(5000);
		driver.findElement(By.linkText("Easel QC")).click();

		s = driver.getPageSource();
		if (s.contains("SAFE User ID:")) {
			driver.findElement(By.id("USER")).sendKeys("X012939");
			;
			driver.findElement(By.id("PASSWORD")).sendKeys("Retrieval@21");
			;
			driver.findElement(By.id("safeLoginbtn")).submit();
			;
			Thread.sleep(2000);
		}

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("CCI")));

		WebElement mySelectElement = driver.findElement(By.name("groupUri"));
		Select dropdown1 = new Select(mySelectElement);
		dropdown1.selectByVisibleText("novus");
		Thread.sleep(2000);

		driver.findElement(By.linkText("CCI")).click();

		mySelectElement = driver.findElement(By.id("environment"));
		Select dropdown = new Select(mySelectElement);
		dropdown.selectByVisibleText("QC");

		WebElement Type = driver.findElement(By.name("cciType"));
		Select type = new Select(Type);
		type.selectByVisibleText("Domain Descriptor");

		WebElement filter = driver.findElement(By.name("fileNameFilter"));
		filter.sendKeys("TestProd");
		Thread.sleep(2000);
		;
		driver.findElement(By.name("Continue")).click();
		driver.findElement(By.linkText("TestProd")).click();
		;
		Thread.sleep(2000);

		int contentType = 99;
		int row1=0; // to 15
		int col1=1;
		int col2 = 2;

		while (contentType++ < 200) {
			row1 = 0;
            Thread.sleep(20000);
			driver.navigate().refresh();
            Thread.sleep(2000);
            
			while(row1++<14) {
            //String xpath = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody["+loop+"]/tr[1]/th[1]/table[1]/tbody[1]/tr[1]/th[1]/img[1]";
            String xpath =  "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody["+contentType+"]/tr[2]/td[2]/div[1]/table[1]/tbody["+row1+"]/tr[1]/th[1]/table[1]/tbody[1]/tr[1]/th[1]/img[1]";
            System.out.println("xpath: "+xpath);
            driver.findElement(By.xpath(xpath)).click();
			Thread.sleep(2000);
			
			//String xpath2 = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody["+loop+"]/tr[1]/td[1]/div[1]";
			String xpath2 = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody["+contentType+"]/tr[2]/td[2]/div[1]/table[1]/tbody["+row1+"]/tr[1]/td["+col1+"]/div[1]";
            System.out.println("xpath2: "+xpath2);
			driver.findElement(By.xpath(xpath2)).click();
			
			//String select = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody["+loop+"]/tr[1]/td[1]/div[1]/select[1]";
			String select = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody["+contentType+"]/tr[2]/td[2]/div[1]/table[1]/tbody["+row1+"]/tr[1]/td["+col1+"]/div[1]/select[1]";
	           WebElement Select = driver.findElement(By.xpath(select));
              Select dropdown2= new Select(Select);
              System.out.println("row1: "+row1);
              dropdown2.selectByIndex(row1);
              Thread.sleep(2000);
  			
  			//String select = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody["+loop+"]/tr[1]/td[1]/div[1]/select[1]";
  			
              String st2 = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody["+contentType+"]/tr[2]/td[2]/div[1]/table[1]/tbody["+row1+"]/tr[1]/td["+col2+"]/div[1]";
              System.out.println("st2: "+st2);
              driver.findElement(By.xpath(st2)).click();
              String select2 = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[3]/table[2]/tbody[1]/tr[2]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody["+contentType+"]/tr[2]/td[2]/div[1]/table[1]/tbody["+row1+"]/tr[1]/td["+col2+"]/div[1]/select[1]";
  	           WebElement Select2 = driver.findElement(By.xpath(select2));
                Select dropdown22= new Select(Select2);
                System.out.println("row1%4: "+row1%4);
                dropdown22.selectByIndex(row1%4);
                Thread.sleep(2000);
			}
              
            driver.findElement(By.id("save_changes_action")).click();;
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
			

		}

		driver.quit();
	}

}
