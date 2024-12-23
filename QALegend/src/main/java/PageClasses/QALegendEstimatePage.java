package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.PageUtilities;

public class QALegendEstimatePage 
{
	public WebDriver driver;

	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//a[@title='Add estimate']")
	WebElement addEstimateButton;
	@FindBy(id = "estimate_date")
	WebElement estimateDate;
	@FindBy(id = "valid_until")
	WebElement validuntilDate;
	

}
