package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendTicketTest extends BaseClass
{
	@Test (groups = {"smoke"},retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void verifyTicketAssignment() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageTicketButton();
		String loggeduser=homepage.findLoggedUser();
		ticketpage.clickOnAddTicketButton();
		String tickettitle =ExcelUtility.getStringData(1, 0,"Tickets")+FakerUtility.randomNumberGenerator();
		String ticketdescription=ExcelUtility.getStringData(1, 1,"Tickets");
		String clientname=ExcelUtility.getNumericData(1, 2,"Tickets");
		ticketpage.addTicket(tickettitle, ticketdescription,clientname);
		ticketpage.searchTicketAdded(tickettitle);
		String assigneduser=ticketpage.assignTicketToLoggedUser();
		Assert.assertEquals(assigneduser,loggeduser);
	}
	@Test(groups = {"smoke"},retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void verifyTicketMarkedAsClosed() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageTicketButton();
		ticketpage.clickOnAddTicketButton();
		String tickettitle =ExcelUtility.getStringData(1, 0,"Tickets")+FakerUtility.randomNumberGenerator();
		String ticketdescription=ExcelUtility.getStringData(1, 1,"Tickets");
		String clientname=ExcelUtility.getNumericData(1, 2,"Tickets");
		ticketpage.addTicket(tickettitle, ticketdescription,clientname);
		ticketpage.searchTicketAdded(tickettitle);
		String Status=ticketpage.markTicketToClosed();
		Assert.assertEquals(Status,"Closed");
	}
}