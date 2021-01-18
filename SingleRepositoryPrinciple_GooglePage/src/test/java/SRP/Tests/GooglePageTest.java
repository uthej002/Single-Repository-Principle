package SRP.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SRP.HomePage.GoogleMainPage;
import SRP.ResultsPage.GoogleResultPage;
import junit.framework.Assert;

public class GooglePageTest extends BaseTest{

	private GoogleMainPage googleMainPage;
	private GoogleResultPage googleResultPage;
	
	@BeforeTest
	public void setupPages() {
		this.googleMainPage = new GoogleMainPage(driver);
		this.googleResultPage = new GoogleResultPage(driver);
	}
	
	@Test(dataProvider = "dataSetup")
	public void HomePageTest(String searchText, int index) {
		
		this.googleMainPage.goTo();
		Assert.assertTrue(this.googleMainPage.getSearchWidget().isDisplayed());
		
		this.googleMainPage.getSearchWidget().enterText(searchText);
		Assert.assertTrue(this.googleMainPage.getClickSuggestion().isDisplayed());
		
		this.googleMainPage.getClickSuggestion().clickSuggestionByIndex(index);
		Assert.assertTrue(this.googleResultPage.getNavigationBar().isDisplayed());
		
		this.googleResultPage.getSearchWidget().enterText(searchText);
		Assert.assertTrue(this.googleResultPage.getClickSuggestion().isDisplayed());
		
		this.googleResultPage.getClickSuggestion().clickSuggestionByIndex(index);
		
		this.googleResultPage.getNavigationBar().goToNews();
		Assert.assertTrue(this.googleResultPage.getResultStat().isDisplayed());
		
		this.googleResultPage.getResultStat().getResultStats();
	}
	
	@DataProvider
	public Object[][] dataSetup(){
		return new Object[][] {
			{"Yoda", 2},
			{"yoda quotes", 3},
			{"Man VS wild", 4}
			
		};
	}
	
}
