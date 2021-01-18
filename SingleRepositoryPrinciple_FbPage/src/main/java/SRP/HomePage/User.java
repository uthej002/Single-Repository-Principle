package SRP.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class User extends Common{
	
	@FindBy(xpath = "//span[text()='Uthej']")
	private WebElement username;

	public User(WebDriver driver) {
		super(driver);
	}
	
	public String getUserName() {
		return username.getText();
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(this.username));
		return this.username.isDisplayed();
	}

}
