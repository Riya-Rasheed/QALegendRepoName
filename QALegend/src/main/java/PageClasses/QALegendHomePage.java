package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendHomePage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath = "//span[text()='Events']")
	WebElement homePageEventButton;
	@FindBy(xpath = "//span[text()='Lekshmi Nair']")
	WebElement profileName;
	
	@FindBy(xpath = "//span[text()='Notes']")
	WebElement homePageNoteButton;
	@FindBy(xpath = "//span[text()='Messages']")
	WebElement homePageMessageButton;
	@FindBy(xpath = "//span[text()='Clients']")
	WebElement homePageClientsButton;
	@FindBy(xpath = "//span[text()='Items']")
	WebElement  homePageItemsButton;
	@FindBy(xpath = "//span[text()='Announcements']")
	WebElement homepageAnnouncementButton;
	@FindBy(xpath = "//span[text()='Team members']")
	WebElement homepageTeamMembersButton;
	@FindBy(xpath = "//span[text()='Leave']")
	WebElement homepageLeaveButton;
	@FindBy(xpath = "//span[text()='Time cards']")
	WebElement homepageTimeCardsButton;
	@FindBy(xpath = "//span[text()='Invoices']")
	WebElement homepageInvoicesButton;
	@FindBy(xpath = "//span[text()='Projects']")
	WebElement homepageProjectButton;
	@FindBy(xpath = "//span[text()='All Projects']")
	WebElement homepageAllProjectButton;
	@FindBy(xpath = "//span[text()='Tickets']")
	WebElement homepageTicketButton;
	@FindBy(xpath = "//span[@class='topbar-user-name']")
	WebElement CurrentUser;
	
	
	public QALegendHomePage(WebDriver driver)
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void clickOnHomePageEventButton()
	{
		homePageEventButton.click();
	}




	public Boolean checkforProfileName() 
	{
		return pageutilities.isElementDisplayed(profileName);
	}



	
	public void clickOnHomePageNoteButton()
	{
		
		homePageNoteButton.click();
	}

	public String findLoggedUser()
	{
		String loggedusername = pageutilities.readText(CurrentUser);
		return loggedusername;
	}




	public void clickOnHomePageMessageButton() 
	{
		
		homePageMessageButton.click();
		
	}




	public void clickOnHomePageClientsButton() 
	{
		
		homePageClientsButton.click();
	}
	
	
	public void clickOnHomePageItemsButton() 
	{
		
		
		homePageItemsButton.click();
	}
	
	
	
	
	public void clickOnHomePageAnnouncementButton()
	{
		homepageAnnouncementButton.click();
	}
	
	
	public void clickOnHomePageTeamMembersButton()
	{
		
		homepageTeamMembersButton.click();
	}
	
	public void clickOnHomePageLeaveButton()
	{
		homepageLeaveButton.click();
	}

	
	public void clickOnHomePageTimeCardsButton()
	{
		 homepageTimeCardsButton.click();
	}
	
	public void clickOnHomePageInvoicesButton()
	{
		homepageInvoicesButton.click();
	}
	
	public void clickOnHomePageProjectButton()
	{
		homepageProjectButton.click();
	}

	
	public void clickOnHomePageAllProjectButton()
	{
		homepageAllProjectButton.click();
	}

	public void clickOnHomePageTicketButton()
	{
		homepageTicketButton.click();
	}
	
}
