package CheckBoxRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	private static WebDriver driver;
	private static WebElement element = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.html.am/html-codes/forms/html-checkbox-code.cfm");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1600)");
			
			WebElement maleRadioBUtton;
			maleRadioBUtton =driver.findElement(By.xpath("//input[@value='male']"));
			maleRadioBUtton.click();
			
			WebElement submitMaleRadioButton;
			submitMaleRadioButton = driver.findElement(By.xpath("//input[@value='unknown']//following::input"));
			submitMaleRadioButton.click();

		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
