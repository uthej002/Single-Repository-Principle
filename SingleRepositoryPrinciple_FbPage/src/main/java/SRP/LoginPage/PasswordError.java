package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class PasswordError extends Common{
	
	@FindBy(xpath = "//a[text()='Forgotten password?']/parent::div[contains(text(), 'The')]")
	private WebElement ErrorMsg;

	public PasswordError(WebDriver driver) {
		super(driver);
	}

	public void getErrorMsg() {
		System.out.println(this.ErrorMsg.getText());
	}	
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(ErrorMsg));
		return this.ErrorMsg.isDisplayed();
	}

}
