package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendProjectTest extends BaseClass 
{
	@Test(retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void verifyAddProject() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageProjectButton();
		homepage.clickOnHomePageAllProjectButton();
		projectpage.clickOnAddProjectButton();
		String prjtitle =ExcelUtility.getStringData(1, 0,"Project")+FakerUtility.randomNumberGenerator();
		String prjdescription=ExcelUtility.getStringData(1, 1,"Project");
		projectpage.addProject(prjtitle, prjdescription);
		String project=projectpage.searchProjectAdded(prjtitle);
		Assert.assertEquals(project,prjtitle );
	}
	@Test(retryAnalyzer = TestScript.RetryAnalyzer.class)
	public void verifyDeleteProject() throws IOException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageProjectButton();
		homepage.clickOnHomePageAllProjectButton();
		projectpage.clickOnAddProjectButton();
		String prjtitle =ExcelUtility.getStringData(1, 0,"Project")+FakerUtility.randomNumberGenerator();
		String prjdescription=ExcelUtility.getStringData(1, 1,"Project");
		projectpage.addProject(prjtitle, prjdescription);
		projectpage.searchProjectAdded(prjtitle);
		projectpage.deleteProject();
		Boolean MsgNodatafound=projectpage.checkForDeletedProject();
		Assert.assertEquals(MsgNodatafound, true);
		
	}
	
}