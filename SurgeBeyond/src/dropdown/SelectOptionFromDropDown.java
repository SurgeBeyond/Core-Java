package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionFromDropDown {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.get("http://studydunes.com/classroom/classrooms/stream_search_result");
			Thread.sleep(1000);

			// Select by Index
			WebElement selectstream = driver.findElement(By.id("ClassRoomSubjectId"));
			Select stream = new Select(selectstream);
			Thread.sleep(3000);
			stream.selectByIndex(1);
			Thread.sleep(3000);
			stream.selectByValue("10");
			Thread.sleep(3000);
			stream.selectByVisibleText("Testing");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
