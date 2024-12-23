package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendLeaveTest extends BaseClass
{
	@Test
	public void addLeave() throws IOException 
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageLeaveButton();
		leavepage.clickOnAddNoteButton();
//		String leaveType = ExcelUtility.getStringData(1, 0, "Leave")+FakerUtility.randomNumberGenerator();
		String leaveDuration = ExcelUtility.getStringData(1, 1,"Leave" );
		String leaveReason = ExcelUtility.getStringData(1, 3,"Leave" );
		leavepage.addLeave( leaveDuration, leaveReason);
		
	
	
	
	
	
	
	
	
	}
}
