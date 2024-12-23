package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendTeamMembersTest extends BaseClass
{
	@Test
	public void addTeamMembers() throws IOException
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageTeamMembersButton();
		teammemberspage.clickOnAddTeamMemberButton();
		String teamfirstName = ExcelUtility.getStringData(1, 0, "Team Members")+FakerUtility.randomNumberGenerator();
		String teamlastName = ExcelUtility.getStringData(1, 1,"Team Members" );
		String teammailingAddress = ExcelUtility.getStringData(1, 2,"Team Members" );
		String teamphoneNumber = ExcelUtility.getNumericData(1, 3,"Team Members" );
		String teamGender = ExcelUtility.getStringData(1, 4,"Team Members" );
		String teamjobTtile = ExcelUtility.getStringData(1, 5,"Team Members" );
		String teamSalary = ExcelUtility.getNumericData(1, 6,"Team Members" );
		String teamdateofHire = ExcelUtility.getNumericData(1, 7,"Team Members" );
		String teamEmail = ExcelUtility.getStringData(1, 8,"Team Members" );
		String teamPassword = ExcelUtility.getStringData(1, 9,"Team Members" );
		teammemberspage.addTeamMembers(teamfirstName,teamlastName,teammailingAddress, teamphoneNumber,teamGender,teamjobTtile,teamEmail,teamPassword);
		Assert.assertEquals(teammemberspage.teammembersPageNextButtonStatusChecker(), true);
		Assert.assertEquals(teammemberspage.teammembersPageNextButtonsStatusChecker(), true);
		Assert.assertEquals(teammemberspage.teammembersPageSaveButtonStatusChecker(), true);
		
	
	
	}

}
