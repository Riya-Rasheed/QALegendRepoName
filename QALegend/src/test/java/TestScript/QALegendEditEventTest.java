package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendEditEventTest extends BaseClass
{
	@Test
	public void editEventTestCases() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		String searchEventTitle = ExcelUtility.getStringData(1, 0, "EventEdit");
		String editTitle = ExcelUtility.getStringData(1, 1,"EventEdit" )+FakerUtility.randomNumberGenerator();
		String editDescription = ExcelUtility.getStringData(1, 2,"EventEdit" );
		editeventpage.searchEvent(searchEventTitle);
		editeventpage.editEventClick();
		editeventpage.editEvent(editTitle, editDescription);
		Assert.assertEquals(editeventpage.editeventPageSaveButtonStatusChecker(), true);
		
	}
	
	
	
	
	
	
	
	
}
