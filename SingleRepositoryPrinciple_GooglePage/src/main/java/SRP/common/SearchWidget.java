package SRP.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchWidget extends AbstractComponent{
	
	@FindBy(name = "q")
	private WebElement SearchBox;
	
	
	public SearchWidget(WebDriver driver) {
		super(driver);
	}
	
	public void enterText(String text) {
		this.SearchBox.clear();
		this.SearchBox.sendKeys(text);
	}

	@Override
	public boolean isDisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(SearchBox));
		return this.SearchBox.isDisplayed();
	}

}
