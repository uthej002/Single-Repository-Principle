package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class ForgotPassword extends Common {
	
	@FindBy(linkText =  "Forgotten password?")
	private WebElement ForgotPass;

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	public void clickForgotPasswd() {
		this.ForgotPass.click();
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(ForgotPass));
		return this.ForgotPass.isDisplayed();
	}

}
