package SRP.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SRP.common.ClickSuggestion;
import SRP.common.SearchWidget;

public class GoogleMainPage {
	
	private WebDriver driver;
	private SearchWidget searchWidget;
	private ClickSuggestion clickSuggestion;

	public GoogleMainPage(final WebDriver driver) {
		this.driver = driver;
		this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
		this.clickSuggestion = PageFactory.initElements(driver, ClickSuggestion.class);
	}
	
	public void goTo() {
		driver.get("https://www.google.com");
	}
	
	public SearchWidget getSearchWidget() {
		return this.searchWidget;
	}
	
	public ClickSuggestion getClickSuggestion() {
		return this.clickSuggestion;
	}
}
