package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendTeamMembersPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	
	@FindBy(xpath = "//a[@title='Add member']")
	WebElement addteammemberButton;
	@FindBy(id = "first_name")
	WebElement firstnameBox;
	@FindBy(id = "last_name")
	WebElement lastnameBox;
	@FindBy(id = "address")
	WebElement mailaddressBox;
	@FindBy(id = "phone")
	WebElement phoneBox;
	@FindBy(id = "gender_male")
	WebElement gendermaleButton;
	@FindBy(id = "gender_female")
	WebElement genderfemaleButton;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
	WebElement closeButton;
	@FindBy(id = "form-next")
	WebElement nextButton;
	@FindBy(id = "job_title")
	WebElement jobtitleBox;
	@FindBy(id = "salary")
	WebElement salaryBox;
	@FindBy(id = "date_of_hire")
	WebElement dateofhireBox;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
	WebElement previousButton;
	@FindBy(id = "form-next")
	WebElement nextButtons;
	@FindBy(id = "email")
	WebElement emailBox;
	@FindBy(id = "password")
	WebElement passwordBox;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveButton;
	@FindBy(id = "")
	WebElement searchButton;
	
	public QALegendTeamMembersPage(WebDriver driver) 
	{
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}


	public void clickOnAddTeamMemberButton() 
	{
		pageutilities.clickOnElement(addteammemberButton);
		
	}

	public void addTeamMembers(String teamfirstName, String teamlastName, String teammailingAddress,
			String teamphoneNumber, String teamGender, String teamjobTtile, String teamEmail, String teamPassword) 
	{
		firstnameBox.sendKeys(teamfirstName);
		lastnameBox.sendKeys(teamlastName);
		mailaddressBox.sendKeys(teammailingAddress);
		phoneBox.sendKeys(teamphoneNumber);
		pageutilities.radioButtonSelect(genderfemaleButton);
		pageutilities.clickOnElement(nextButton);
		jobtitleBox.sendKeys(teamjobTtile);
		dateofhireBox.sendKeys("24-12-30");
		pageutilities.clickOnElement(nextButton);
		emailBox.sendKeys(teamEmail);
		passwordBox.sendKeys(teamPassword);
	}

	public boolean teammembersPageNextButtonStatusChecker() 
	{
		
		return(pageutilities.isElementEnabled(nextButton));
	}

	public boolean teammembersPageNextButtonsStatusChecker() 
	{
		
		return(pageutilities.isElementEnabled(nextButtons));
	}
	
	
	public boolean teammembersPageSaveButtonStatusChecker() 
	{
		
		return(pageutilities.isElementEnabled(saveButton));
	}


	public void searchTeamAdded(String name)
	{
	    WaitUtility.waitForClickingElement(driver, searchButton);
	searchButton.click();
	pageutilities.enterText(searchButton, name);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
