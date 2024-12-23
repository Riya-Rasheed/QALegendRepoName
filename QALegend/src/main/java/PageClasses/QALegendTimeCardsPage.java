package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendTimeCardsPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//a[@title='Add time manually']")
	WebElement addtimemanuallyButton;
	@FindBy(id = "s2id_autogen103_search")
	WebElement teammemberBox;
	@FindBy(id = "select2-chosen-327")
	WebElement teammemberdropdownBox;
	@FindBy(id = "in_date")
	WebElement indateBox;
	@FindBy(id = "out_date")
	WebElement outdateBox;
	@FindBy(id = "in_time")
	WebElement intimeBox;
	@FindBy(id = "out_time")
	WebElement outimeBox;
	@FindBy(id = "note")
	WebElement noteBox;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[3]")
	WebElement closeButton;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
	public QALegendTimeCardsPage  (WebDriver driver)
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddTimeCardsButton()
	{
		pageutilities.clickOnElement( addtimemanuallyButton);
	}
	
	public void addTimeCards(String timecardsTeamMember, String timecardsNote) 
	{
//		teammemberBox.click();
//		pageutilities.enterText(teammemberdropdownBox, timecardsTeamMember);
//		pageutilities.EnterKeyPress();
		indateBox.sendKeys("24-12-17");
		outdateBox.sendKeys("24-12-19");
		intimeBox.sendKeys("1:00 AM");
		outimeBox.sendKeys("2:00 AM");
		pageutilities.enterText(noteBox, timecardsNote);
		pageutilities.clickOnElement(saveButton);
	}
	
	
	

	
}
