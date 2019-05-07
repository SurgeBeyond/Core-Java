package ClickOnImage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

	private static WebDriver driver;
	private static WebElement element = null;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.seleniumhq.org/");
			driver.manage().window().maximize();

			WebElement seImageXPath;
			seImageXPath = driver.findElement(By.xpath("//a[contains(@href,'/projects/webdriver/')]"));
			seImageXPath.click();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
