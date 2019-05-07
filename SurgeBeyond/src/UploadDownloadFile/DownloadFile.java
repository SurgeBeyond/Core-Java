package UploadDownloadFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile{
	public static WebDriver driver;

	public static void main(String[] args)  throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://selenium-release.storage.googleapis.com/index.html?path=2.39/");
		Thread.sleep(3000);
		WebElement downloadButton = driver
				.findElement(By.xpath("//a[contains(@href, 'Win32_2.39.0.zip')]"));

		//downloadButton.click();
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "cmd /c C:\\Users\\UX012939\\Wget\\wget.exe -P C:\\Users\\UX012939\\Wget --no-check-certificate "
				+ sourceLocation;

		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (InterruptedException | IOException ex) {
			System.out.println(ex.toString());
		}
		driver.close();
	}

}