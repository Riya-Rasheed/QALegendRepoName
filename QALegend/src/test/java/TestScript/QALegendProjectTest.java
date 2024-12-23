package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendProjectTest extends BaseClass 
{
	@Test
	public void verifyAddProject() throws IOException, InterruptedException 
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageProjectButton();
		homepage.clickOnHomePageAllProjectButton();
		projectpage.clickOnAddProjectButton();
		String prjtitle =ExcelUtility.getStringData(1, 0, "Project")+FakerUtility.randomNumberGenerator();
		String prjdescription=ExcelUtility.getStringData(1, 1, "Project");
		projectpage.addProject(prjtitle, prjdescription);
		projectpage.searchProjectadded(prjtitle);
	}
}
