package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendTimeCardsTest extends BaseClass
{
	@Test
	
	public void addTimeCards() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageTimeCardsButton();
		timecardspage.clickOnAddTimeCardsButton();
		String timecardsTeamMember = ExcelUtility.getStringData(1, 0, "Time Cards")+FakerUtility.randomNumberGenerator();
		String timecardsNote = ExcelUtility.getStringData(1, 5,"Time Cards" );
		timecardspage.addTimeCards(timecardsTeamMember,timecardsNote );
		
	
	}
}
