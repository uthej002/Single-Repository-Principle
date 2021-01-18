package SRP.ResultsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SRP.common.AbstractComponent;

public class ResultStat extends AbstractComponent{

	@FindBy(xpath = "//div[@id='result-stats']")
	private WebElement ResultStats;
	
	public ResultStat(WebDriver driver) {
		super(driver);
	}

	public String getResultStats() {
		return ResultStats.getText();
	}
	
	@Override
	public boolean isDisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.ResultStats));
		return this.ResultStats.isDisplayed();
	}

}
