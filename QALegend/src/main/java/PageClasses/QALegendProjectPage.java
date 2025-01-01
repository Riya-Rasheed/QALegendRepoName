package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class QALegendProjectPage 
{
	public WebDriver driver;

	public PageUtilities pageutilities;

	@FindBy (xpath = "//a[@title='Add project']")

	WebElement addprojectbutton;

	@FindBy(id="title")

	WebElement projecttitlebox;

	@FindBy(id="description")

	WebElement projectdescriptionbox;

	@FindBy (xpath = "//input[@id='deadline']")

	WebElement deadlinedatebox;

	@FindBy (xpath="//td[@class='today day']")

	WebElement deadlinedateselectbtn;

	@FindBy (xpath = "//button[@class='btn btn-primary']")

	WebElement savebtn;

	//@FindBy (xpath="//div[@id='project-table_filter']//descendant::input")

	@FindBy(xpath="//input[@type='search']")

	WebElement srchbox;

   @FindBy (id="ajaxModalContent")

   WebElement addprojectmodal;



 	public QALegendProjectPage(WebDriver driver) 

	{

		this.driver=driver;

		this.pageutilities=new PageUtilities(driver);

		PageFactory.initElements(driver,this);

	}

	public void clickOnAddProjectButton() 

	{

		
		addprojectbutton.click();


	}

	public void addProject(String title,String description)

	{

		pageutilities.enterText(projecttitlebox, title);

		pageutilities.enterText(projectdescriptionbox, description);

		WaitUtility.waitForClickingElement(driver, deadlinedatebox);

		pageutilities.clickOnElement(deadlinedatebox);

		pageutilities.clickOnElement(deadlinedateselectbtn);

		pageutilities.clickOnElement(savebtn);

	}
	
	public boolean projectPageSaveButtonStatusChecker() 
	{
		
		return(pageutilities.isElementEnabled(srchbox));
	}
	
	

	public void searchProjectadded(String title) throws InterruptedException

	{

		WaitUtility.waitForInVisiblityOfElement(driver, addprojectmodal);

		pageutilities.javaScriptClick(srchbox);

		pageutilities.enterText(srchbox, title);

	}





}
