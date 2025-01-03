package PageClasses;

import javax.swing.Scrollable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendAnnouncementsPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//a[@title='Add announcement']")
	WebElement addanouncementButton;
	@FindBy(id = "title")
	WebElement titleBox;
	@FindBy(xpath = "//div[@class='note-editable panel-body']")
	WebElement noteBox;
	@FindBy(id = "start_date")
	WebElement startdateBox;
	@FindBy(id = "end_date")
	WebElement enddateBox;
	@FindBy(xpath = "//button[@class='btn btn-default upload-file-button pull-left btn-sm round dz-clickable']")
	WebElement uploadfileButton;
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	WebElement saveButton;
	
	
	public QALegendAnnouncementsPage (WebDriver driver)
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddAnnouncementButton()
	{
		pageutilities.clickOnElement(addanouncementButton);
	}
	
	public void addAnnouncement(String title,String note,String startdate,String enddate)
	{
		pageutilities.enterText(titleBox, title);
		pageutilities.enterText(noteBox, note);
		pageutilities.enterText(startdateBox, startdate);
		pageutilities.EnterKeyPress();
		pageutilities.enterText(enddateBox, enddate);
		pageutilities.EnterKeyPress();
//		startdateBox.sendKeys("2024-12-26");
//		enddateBox.sendKeys("2025-01-03");
		pageutilities.scrollToElement(saveButton);
		
		
	}
	
	public boolean announcementPageSendButtonChecker()
	{
		return(pageutilities.isElementEnabled(saveButton));
	}
	
	
	
	
}
