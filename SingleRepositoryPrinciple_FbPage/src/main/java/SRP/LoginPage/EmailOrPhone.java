package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.Common;

public class EmailOrPhone extends Common {	
	
	@FindBy(id = "email")
    private WebElement Email;
	
	public EmailOrPhone(WebDriver driver) {
		super(driver);
	}
	
	public void setEmail(String email) {
		this.Email.clear();
		this.Email.sendKeys(email);
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(this.Email));
		return this.Email.isDisplayed();
	}
	
	
}
