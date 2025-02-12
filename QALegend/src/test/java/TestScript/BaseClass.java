package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Constants.ConstantValues;
import PageClasses.QALegendAnnouncementsPage;
import PageClasses.QALegendClientsPage;
import PageClasses.QALegendEditAnnouncementPage;

import PageClasses.QALegendEditEventPage;

import PageClasses.QALegendEventPage;
import PageClasses.QALegendHomePage;



import PageClasses.QALegendLoginPage;
import PageClasses.QALegendMessagePage;
import PageClasses.QALegendNotePage;
import PageClasses.QALegendProjectPage;

import PageClasses.QALegendTicketPage;

import Utilities.ScreenshotUtility;

public class BaseClass 
{
	public WebDriver driver;
	QALegendLoginPage loginpage;
	QALegendHomePage homepage;
	QALegendEventPage eventpage;
	
	QALegendNotePage notepage;
	QALegendMessagePage messagepage;
	QALegendClientsPage clientspage;

	QALegendAnnouncementsPage announcementpage;
	
	QALegendEditEventPage editeventpage;
	QALegendProjectPage projectpage;
	
	QALegendEditAnnouncementPage annpage;
	QALegendTicketPage ticketpage;
	
	public Properties prop;
	public FileInputStream fis;
	String browserName = "chrome";
	@BeforeMethod(alwaysRun = true,groups = {"smoke","Sanity","Regression"})
	
	public void browserintialization() throws Exception 
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid name exception");
		}
		prop = new Properties();
		fis = new FileInputStream(ConstantValues.USERDATAFILE);
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage = new QALegendLoginPage (driver);
		homepage = new QALegendHomePage(driver);
		eventpage = new QALegendEventPage(driver);
		
		notepage = new QALegendNotePage(driver);
		messagepage = new  QALegendMessagePage(driver);
		clientspage = new QALegendClientsPage(driver);
		
		announcementpage = new QALegendAnnouncementsPage(driver);
	
		
	
	
		
		editeventpage = new QALegendEditEventPage(driver);
		
		projectpage = new QALegendProjectPage(driver);
		
		annpage = new QALegendEditAnnouncementPage(driver);
		ticketpage = new QALegendTicketPage(driver);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult itResult) throws IOException
	{
		if(itResult.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtility sc = new ScreenshotUtility();
			sc.captureFailureScreenshot(driver,itResult.getName());
		}
		if(driver!=null)
		{
			driver.quit();
		}
	}
}
		
	



