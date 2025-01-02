package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendAnnouncementTest extends BaseClass
{
	@Test(groups = {"smoke"})
	public void addAnnouncement() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageAnnouncementButton();
		announcementpage.clickOnAddAnnouncementButton();
		String announcementTitle = ExcelUtility.getStringData(1, 0, "Announcements")+FakerUtility.randomNumberGenerator();
		String announcementNote = ExcelUtility.getStringData(1, 1,"Announcements" );
		announcementpage.addAnnouncement( announcementTitle, announcementNote);
		Assert.assertEquals(announcementpage.announcementPageSendButtonChecker(), true);
		
	}

}
