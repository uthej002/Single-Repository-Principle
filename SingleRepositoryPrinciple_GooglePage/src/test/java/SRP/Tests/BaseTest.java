package SRP.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest{
	
	protected WebDriver driver;
	
	@BeforeTest
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
	
}