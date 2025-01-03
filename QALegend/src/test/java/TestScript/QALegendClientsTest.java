package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendClientsTest extends BaseClass
{
	@Test
	public void verifyAddClient() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageClientsButton();
		clientspage.clickOnAddClientButton();
		String company =ExcelUtility.getStringData(1, 0, "Client")+FakerUtility.randomNumberGenerator();
		String addr=ExcelUtility.getStringData(1, 1, "Client");
		String city=ExcelUtility.getStringData(1, 2, "Client");
		String state=ExcelUtility.getStringData(1, 3, "Client");
		String country=ExcelUtility.getStringData(1, 4, "Client");
		String phone=ExcelUtility.getNumericData(1, 5, "Client");
		String currency=ExcelUtility.getStringData(1, 6, "Client");
		clientspage.addClient(company, addr, city, state, country, phone, currency);
		String client=clientspage.searchForAddedClient(company);
		Assert.assertEquals(client,company );
	
	}
	@Test
	public void verifyEditClient() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageClientsButton();
		clientspage.clickOnAddClientButton();
		String company =ExcelUtility.getStringData(1, 0, "Client")+FakerUtility.randomNumberGenerator();
		String addr=ExcelUtility.getStringData(1, 1, "Client");
		String city=ExcelUtility.getStringData(1, 2, "Client");
		String state=ExcelUtility.getStringData(1, 3, "Client");
		String country=ExcelUtility.getStringData(1, 4, "Client");
		String phone=ExcelUtility.getNumericData(1, 5, "Client");
		String currency=ExcelUtility.getStringData(1, 6, "Client");
		clientspage.addClient(company, addr, city, state, country, phone, currency);
		clientspage.searchForAddedClient(company);
		String addrnew=ExcelUtility.getStringData(1,7,"Clients")+FakerUtility.randomNumberGenerator();
		String actualaddr=clientspage.editNoteAdded(addrnew);
		Assert.assertEquals(actualaddr,addrnew );
	
	}

}