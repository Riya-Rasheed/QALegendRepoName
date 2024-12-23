package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendClientsPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//a[@title='Add client']")
	WebElement addclientButton;
	@FindBy(id="company_name")
	WebElement companynameTextBox;
	@FindBy(id="address")
	WebElement addressTextBox;
	@FindBy(id = "city")
	WebElement cityTextBox;
	@FindBy(id = "state")
	WebElement stateTextBox;
	@FindBy(id = "zip")
	WebElement zipTextBox;
	@FindBy(id = "country")
	WebElement countryTextBox;
	@FindBy(id = "phone")
	WebElement phoneTextBox;
	@FindBy(id = "website")
	WebElement websiteTextBox;
	@FindBy(id = "vat_number")
	WebElement vatnumberTextBox;
	@FindBy(id = "s2id_autogen6")
	WebElement clientgroupsTextBox;
	@FindBy(id = "s2id_autogen5_search")
	WebElement currencyTextBox;
	@FindBy(id = "currency_symbol")
	WebElement currencysymbolTextBox;
	@FindBy(id = "disable_online_payment")
	WebElement disableonlinepaymentCheckBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
	WebElement closeButton;
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchButton;
	@FindBy(xpath = "//tr[@role='row']//following::a")
	WebElement firstRowAfterSearch;
	


	

	public QALegendClientsPage(WebDriver driver) 
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}




	public void clickOnAddClientsButton() 
	
		{
			addclientButton.click();
		}
		
		
	




	public void addClients(String company, String clientsaddress,String city,String state) 
	{
		
		pageutilities.enterText(companynameTextBox,company);
		pageutilities.enterText(addressTextBox,clientsaddress);
		pageutilities.enterText(cityTextBox, city);
		pageutilities.enterText(stateTextBox, state);
		pageutilities.clickOnElement(saveButton);
	}



	public String verifyAddedClient(String company) throws InterruptedException
	{
		Thread.sleep(2000);
		searchButton.click();
		searchButton.sendKeys(company);
		//pageutilities.EnterKeyPress();
		return firstRowAfterSearch.getText();
		
	}

	
	
	
	

}
