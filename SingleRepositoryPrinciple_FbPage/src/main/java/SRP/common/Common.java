package SRP.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Common {
	
	protected WebDriverWait wait;
	
	public Common(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}

	public abstract boolean isDisplayed();

}
