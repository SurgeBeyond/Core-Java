package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\UX012939\\Downloads\\chromedriver_win32\\" + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement searchInputField = driver.findElement(By.name("q"));

		Actions actions = new Actions(driver);
		Action seriesOfActions = actions.moveToElement(searchInputField).click().keyDown(searchInputField, Keys.SHIFT)
				.sendKeys(searchInputField, "surgebeyond").keyUp(searchInputField, Keys.SHIFT).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build();

		seriesOfActions.perform();
	}
}