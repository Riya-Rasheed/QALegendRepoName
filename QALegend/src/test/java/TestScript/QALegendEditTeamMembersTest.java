package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendEditTeamMembersTest extends BaseClass
{
	@Test
	public void editTeamTestCases() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageTeamMembersButton();
		String searchTeam = ExcelUtility.getStringData(1, 0, "TeamEdit");
		
		teampage.searchTeamAdded(searchTeam);
		
	}

}