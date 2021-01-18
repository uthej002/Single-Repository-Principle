package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class NewAccount extends Common{
	@FindBy(linkText =  "Create New Account")
	private WebElement CreateNewAccount;

	public NewAccount(WebDriver driver) {
		super(driver);
	}
	
	public void clickForgotPasswd() {
		this.CreateNewAccount.click();
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(CreateNewAccount));
		return this.CreateNewAccount.isDisplayed();
	}
}
