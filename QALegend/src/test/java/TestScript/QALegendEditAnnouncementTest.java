package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;

public class QALegendEditAnnouncementTest extends BaseClass 
{
	@Test(retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void editannouncementTestCases() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageTeamMembersButton();
		String searchTeam = ExcelUtility.getStringData(1, 0, "TeamAnnouncement");
		Assert.assertEquals(annpage.editannouncementPageSearchButtonStatusChecker(), true);
		
		annpage.searchAnnouncement(searchTeam);
		
	}

}
