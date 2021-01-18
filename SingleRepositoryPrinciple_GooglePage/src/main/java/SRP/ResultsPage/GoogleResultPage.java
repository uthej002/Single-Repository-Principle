package SRP.ResultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import SRP.common.ClickSuggestion;
import SRP.common.SearchWidget;

public class GoogleResultPage {
	
	private ClickSuggestion clickSuggestion;
	private SearchWidget searchWidget;
	private NavigationBar navigationBar;
	private ResultStat resultStat;
	
	public GoogleResultPage(final WebDriver driver) {
		this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
		this.clickSuggestion = PageFactory.initElements(driver, ClickSuggestion.class);
		this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
		this.resultStat = PageFactory.initElements(driver, ResultStat.class);
	}
	
	public SearchWidget getSearchWidget() {
		return this.searchWidget;
	}
	
	public ClickSuggestion getClickSuggestion() {
		return this.clickSuggestion;
	}
	
	public NavigationBar getNavigationBar() {
		return this.navigationBar;
	}
	
	public ResultStat getResultStat() {
		return this.resultStat;
	}
	
}
