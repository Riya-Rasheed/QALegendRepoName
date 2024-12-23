package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendLeavePage 
{
	
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//a[@title='Apply leave']")
	WebElement applyleaveButton;
	@FindBy(id = "s2id_autogen17_search")
	WebElement toleaveBox;
	@FindBy(id = "select2-result-label-20")
	WebElement selectdropdownBox;
	@FindBy(id = "duration_single_day")
	WebElement durationBox;
	@FindBy(id = "single_date")
	WebElement dateBox;
	@FindBy(id = "reason")
	WebElement reasonBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement applyleaveBox;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
	WebElement closeButton;
	
	
	


	public QALegendLeavePage(WebDriver driver) 
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}





	public void clickOnAddNoteButton() 
	{
		
		pageutilities.clickOnElement(applyleaveButton);
	}
	


	public void addLeave( String leaveDuration, String leaveReason) 
	{
		
//		toleaveBox.sendKeys("casual leave");
		pageutilities.clickOnDownArrow();
		pageutilities.EnterKeyPress();
		pageutilities.radioButtonSelect(durationBox);
		dateBox.sendKeys("24-12-18");
		reasonBox.sendKeys(leaveReason);
		pageutilities.clickOnElement(applyleaveBox);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
