package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEditEventPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "(//span[@class='fc-title'])[287]")
	WebElement eventSearchTitle;
	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")
	WebElement editButton;
	@FindBy(id = "title")
	WebElement editTitleBox;
	@FindBy(id = "description")
	WebElement editDescBox;
	@FindBy(id = "start_date")
	WebElement startdateBox;
	@FindBy(id = "end_date")
	WebElement enddateBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
	public QALegendEditEventPage(WebDriver driver)
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}


	public void searchEvent(String search_event)
	{
		eventSearchTitle.click();
		
	}
	
	
	
	public void editEventClick()
	{
		editButton.click();
	}
	
	public void editEvent(String title,String desc)
	{
		editTitleBox.clear();
		pageutilities.enterText(editTitleBox, title);
		editDescBox.clear();
		pageutilities.enterText(editTitleBox, desc);
//		saveButton.click();
	}
	
	public boolean editeventPageSaveButtonStatusChecker() 
	{
		
		return(pageutilities.isElementEnabled(saveButton));
	}
	
}
