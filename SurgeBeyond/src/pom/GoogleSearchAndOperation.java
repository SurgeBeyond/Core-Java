package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchAndOperation {

	private WebDriver driver;
	private String text;
	private By byNameInputBox = By.name("q");
	private WebElement inputBox;
	private String URL = "http://google.com/";

	public GoogleSearchAndOperation(WebDriver driver) {
		this.driver = driver;
		driver.get(URL);
	}

	public void setTextAndSubmit(String text) throws Exception {
		try {
			inputBox = driver.findElement(byNameInputBox);
			inputBox.clear();
			inputBox.sendKeys(text);
			inputBox.submit();
		} catch (Exception e) {
			throw e;
		}
	}
}
