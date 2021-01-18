package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class Password extends Common {
	
	@FindBy(id = "pass")
	private WebElement passwd;

	public Password(WebDriver driver) {
		super(driver);
	}

	public void setPassword(String pass) {
		this.passwd.clear();
		this.passwd.sendKeys(pass);
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(passwd));
		return this.passwd.isDisplayed();
	}

}
