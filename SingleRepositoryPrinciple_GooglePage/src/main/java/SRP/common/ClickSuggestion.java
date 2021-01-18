package SRP.common;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickSuggestion extends AbstractComponent{
	
	@FindBy(xpath = "//li[@class='sbct']")
	private List<WebElement> Suggestions;
	
	public ClickSuggestion(WebDriver driver){
		super(driver);
	}
	
	public void clickSuggestionByIndex(int index) {
		this.Suggestions.get(index-1).click();
	}
	
	@Override
	public boolean isDisplayed() {
		return this.wait.until((t) -> Suggestions.size() > 4);
	}
	
}
