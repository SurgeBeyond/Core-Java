package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://google.co.in");

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			/*
			 * https://commons.apache.org/proper/commons-io/download_io.cgi
			 */
			FileUtils.copyFile(scrFile, new File("C:\\Users\\UX012939\\Documents\\Novus\\screenshot.png"));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());

		} finally {
			driver.close();
			System.exit(0);
		}
	}
}
