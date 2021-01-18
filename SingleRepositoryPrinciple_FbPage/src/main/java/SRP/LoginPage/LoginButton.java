package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class LoginButton extends Common {
	
	@FindBy(name = "login")
	private WebElement LoginBtn;

	public LoginButton(WebDriver driver) {
		super(driver);
	}
	
	public void clickLogin() {
		this.LoginBtn.click();
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(LoginBtn));
		return this.LoginBtn.isDisplayed();
	}

}
