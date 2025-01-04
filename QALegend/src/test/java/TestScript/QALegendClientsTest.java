package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendClientsTest extends BaseClass
{
	@Test(groups = {"Regression"},retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void addClients() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageClientsButton();
		clientspage.clickOnAddClientsButton();
		String company = ExcelUtility.getStringData(1, 0, "Clients")+FakerUtility.randomNumberGenerator();
		String clientsaddress = ExcelUtility.getStringData(1, 1,"Clients" );
		String city = ExcelUtility.getStringData(1, 2,"Clients" );
		String state = ExcelUtility.getStringData(1, 3,"Clients" );
		clientspage.addClients(company, clientsaddress,city,state);
		String actual = clientspage.verifyAddedClient(company);
		System.out.println(actual);
		Assert.assertEquals(actual, company);
		
	}

}
