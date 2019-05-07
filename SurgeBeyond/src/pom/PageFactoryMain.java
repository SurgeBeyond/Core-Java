package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryMain {

	private WebDriver driver;

	@FindBy(name = "q")
	WebElement inputBox;

	@FindBy(partialLinkText = "Soarlogic")
	WebElement link;

	public PageFactoryMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setTextAndSubmit(String text) throws Exception {
		try {
			inputBox.sendKeys(text);
			inputBox.submit();

			Thread.sleep(3000);

			link.click();
		} catch (Exception e) {
			throw e;
		}
	}
}
