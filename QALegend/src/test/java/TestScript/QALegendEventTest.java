package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

import org.testng.annotations.Test;

public class QALegendEventTest extends BaseClass
{
	@Test
	public void addEvent() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		eventpage.clickOnAddEventButton();
		String eventTitle = ExcelUtility.getStringData(1, 0, "Sheet1")+FakerUtility.randomNumberGenerator();
		String eventDescription = ExcelUtility.getStringData(1, 1,"Sheet1" );
		eventpage.addEvent(eventTitle, eventDescription);
		Assert.assertEquals(eventpage.eventPageSaveButtonStatusChecker(), true);
		
	}

}
