package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

import org.testng.annotations.Test;

public class QALegendEventTest extends BaseClass
{
	@Test(groups = {"smoke"},retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void addEvent() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		eventpage.clickOnAddEventButton();
		String eventTitle = ExcelUtility.getStringData(1, 0, "Sheet1")+FakerUtility.randomNumberGenerator();
		String eventDescription = ExcelUtility.getStringData(1, 1,"Sheet1" );
		String eventStartDate = "2024-12-30";
		String eventEndDate = "2025-01-28";
		eventpage.addEvent(eventTitle, eventDescription,eventStartDate,eventEndDate);
		Assert.assertEquals(eventpage.eventPageSaveButtonStatusChecker(), true);
		
	}

}
