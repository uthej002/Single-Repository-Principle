package SRP.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	private User user;
	
	public Homepage(WebDriver driver) {
		this.user = PageFactory.initElements(driver, User.class);
	}
	
	public User getUser() {
		return this.user;
	}
}
