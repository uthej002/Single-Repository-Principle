package SRP.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	private EmailOrPhone emailOrPhone;
	private Password password;
	private LoginButton loginButton;
	private ForgotPassword forgotPassword;
	private NewAccount newAccount;
	private PasswordError passwdErrorMsg;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.emailOrPhone = PageFactory.initElements(driver, EmailOrPhone.class);
		this.password = PageFactory.initElements(driver, Password.class);
		this.loginButton = PageFactory.initElements(driver, LoginButton.class);
		this.forgotPassword = PageFactory.initElements(driver, ForgotPassword.class);
		this.newAccount = PageFactory.initElements(driver, NewAccount.class);
		this.passwdErrorMsg = PageFactory.initElements(driver, PasswordError.class);
	}
	
	public void goTo(String url) {
		this.driver.get(url);
	}
	
	public EmailOrPhone getEmailorPhone() {
		return this.emailOrPhone;
	}
	
	public Password getPassword() {
		return this.password;
	}
	
	public LoginButton getLoginButton() {
		return this.loginButton;
	}
	
	public ForgotPassword getForgotPassword() {
		return this.forgotPassword;
	}
	
	public NewAccount getNewAccount() {
		return this.newAccount;
	}
	
	public PasswordError getPasswdError() {
		return this.passwdErrorMsg;
	}
}
