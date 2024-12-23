package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendLoginPage 
{
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy (id = "email")
	WebElement userNameField;
	@FindBy (id = "password")
	WebElement passwordField;
	@FindBy(xpath = " //button[text()='Sign in']")
	WebElement signInButton;
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement authenticationFailed;
	
	
	
	
	public QALegendLoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		this.pageutilities = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public void login(String userName,String password)
	{
		pageutilities.enterText(userNameField, userName);
		pageutilities.enterText(passwordField, password);
		pageutilities.clickOnElement(signInButton);
	}
	
	
	public boolean checkforInvalidLogin()
	{
		
		return pageutilities.isElementDisplayed(authenticationFailed);
	}
	
}
