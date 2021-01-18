package SRP.ResultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.AbstractComponent;

public class NavigationBar extends AbstractComponent{

	@FindBy(id = "hdtb-msb")
	private WebElement NavBar;
	
	@FindBy(linkText = "Videos")
	private WebElement Videos;
	
	@FindBy(linkText = "News")
	private WebElement News;
	
	public NavigationBar(WebDriver driver) {
		super(driver);
	}
	
	public void goToVideos() {
		Videos.click();
	}
	
	public void goToNews() {
		News.click();
	}
	
	@Override
	public boolean isDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(this.NavBar));
		return this.NavBar.isDisplayed();
	}

}
