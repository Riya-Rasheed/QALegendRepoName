package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendItemsPage 
{
	
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//a[@title='Add item']")
	WebElement additemButton;
	@FindBy(id = "title")
	WebElement titleBox;
	@FindBy(id = "description")
	WebElement descriptionBox;
	@FindBy(id = "unit_type")
	WebElement unittypeBox;
	@FindBy(id = "item_rate")
	WebElement rateBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	WebElement closeButton;
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchBox;
	@FindBy (xpath = "//a[@title='Item']")
	WebElement item;
	
	
	public QALegendItemsPage(WebDriver driver) 
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddItemButton()
	{
		pageutilities.clickOnElement(additemButton);
	}
	
	public void addItem(String title,String description,String item_rate)
	{
		titleBox.sendKeys(title);
		pageutilities.enterText(descriptionBox, description);
		pageutilities.enterText(rateBox, item_rate);
		pageutilities.clickOnElement(saveButton);
	}
	
	public void searchItemAdded(String itemname)
	{
	    WaitUtility.waitForClickingElement(driver, searchBox);
	searchBox.click();
	pageutilities.enterText(searchBox, itemname);

	}
	
	


	
	
	
	
	
	
	
	
	
}
