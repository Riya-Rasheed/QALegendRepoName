package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendEditAnnouncementPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchBox;
	
	
	public QALegendEditAnnouncementPage(WebDriver driver)
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean editannouncementPageSearchButtonStatusChecker() 
	{
		
		return(pageutilities.isElementEnabled(searchBox));
	}

	
	public void searchAnnouncement(String announcement)
	{
	    WaitUtility.waitForClickingElement(driver, searchBox);
	searchBox.click();
	pageutilities.enterText(searchBox, announcement);

	}
	
}