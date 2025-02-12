package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendAnnouncementTest extends BaseClass
{
	@Test(groups = {"smoke"},retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void addAnnouncement() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageAnnouncementButton();
		announcementpage.clickOnAddAnnouncementButton();
		String announcementTitle = ExcelUtility.getStringData(1, 0, "Announcements")+FakerUtility.randomNumberGenerator();
		String announcementNote = ExcelUtility.getStringData(1, 1,"Announcements" );
		String announcementStartDate = "2024-12-30";
		String announcementEndDate = "2025=01-28";
		announcementpage.addAnnouncement( announcementTitle, announcementNote,announcementStartDate,announcementEndDate);
		Assert.assertEquals(announcementpage.announcementPageSendButtonChecker(), true);
		
	}

}
