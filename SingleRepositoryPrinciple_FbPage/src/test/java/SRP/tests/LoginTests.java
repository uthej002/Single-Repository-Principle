package SRP.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SRP.HomePage.Homepage;
import SRP.LoginPage.LoginPage;
import junit.framework.Assert;

public class LoginTests extends BaseTest {
	
	private LoginPage loginPage;
	private Homepage homePage;
	
	@BeforeTest
	public void setuPage() {
		this.loginPage = new LoginPage(driver);
		this.homePage = new Homepage(driver);
	}
	
	@Test(dataProvider = "dataSetup")
	public void loginValidCredentials(String url) {
		
		this.loginPage.goTo(url);
		
		Assert.assertTrue(this.loginPage.getEmailorPhone().isDisplayed());
		this.loginPage.getEmailorPhone().setEmail("7780658092");
		
		Assert.assertTrue(this.loginPage.getPassword().isDisplayed());
		this.loginPage.getPassword().setPassword("Asd123@@");
		
		Assert.assertTrue(this.loginPage.getLoginButton().isDisplayed());
		this.loginPage.getLoginButton().clickLogin();
		
		Assert.assertTrue(this.homePage.getUser().isDisplayed());
		this.homePage.getUser().getUserName();
	}
	
	@Test(dataProvider = "dataSetup")
	public void loginInvalidPassword(String url) {
		
		this.loginPage.goTo(url);
		
		Assert.assertTrue(this.loginPage.getEmailorPhone().isDisplayed());
		this.loginPage.getEmailorPhone().setEmail("krish@gmail.com");
		
		Assert.assertTrue(this.loginPage.getPassword().isDisplayed());
		this.loginPage.getPassword().setPassword("Asd123@@");
		
		Assert.assertTrue(this.loginPage.getLoginButton().isDisplayed());
		this.loginPage.getLoginButton().clickLogin();
		
		Assert.assertTrue(this.loginPage.getPasswdError().isDisplayed());
		this.loginPage.getPasswdError().getErrorMsg();
	}
	
	@DataProvider
	public Object[][] dataSetup() {
		return new Object[][] {
			{"https://www.facebook.com"}
		};
	}
	
}
