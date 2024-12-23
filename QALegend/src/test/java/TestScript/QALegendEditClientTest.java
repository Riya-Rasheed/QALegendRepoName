package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendEditClientTest extends BaseClass

{
	@Test
	public void editClientTestCases() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageClientsButton();
		String searchClient = ExcelUtility.getStringData(1, 0, "ClientsEdit");
		String editCompany = ExcelUtility.getStringData(1, 1,"ClientsEdit" )+FakerUtility.randomNumberGenerator();
		String editAddress = ExcelUtility.getStringData(1, 2,"ClientsEdit" );
		editclientpage.searchClient(searchClient);
		editclientpage.editClientClick();
		editclientpage.editClient(editCompany, editAddress);
	}
	
}
