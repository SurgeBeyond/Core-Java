package UploadDownloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://www.tinyupload.com/";
		driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.name("uploaded_file"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\UX012939\\Downloads\\a.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();
	}
}