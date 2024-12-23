package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEditClientPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchTextBox;
	@FindBy(xpath = "//a[@title='Edit client']")
	WebElement editButton;
	@FindBy(id = "company_name")
	WebElement editCompanyName;
	@FindBy(id = "address")
	WebElement editAddress;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	
	
	public QALegendEditClientPage(WebDriver driver)
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void searchClient(String search_company)
	{
		pageutilities.enterText(searchTextBox, search_company);
	}
	
	public void editClientClick()
	{
		editButton.click();
	}
	
	public void editClient(String company,String address)
	{
		editCompanyName.clear();
		pageutilities.enterText(editCompanyName, company);
		editAddress.clear();
		pageutilities.enterText(editAddress, address);
		saveButton.click();
	}
	
	
	
}
