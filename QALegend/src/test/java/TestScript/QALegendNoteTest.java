package TestScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendNoteTest extends BaseClass
{
	@Test
	public void verifyAddNoteTest() throws IOException, AWTException, InterruptedException
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.clickOnHomePageNoteButton();
		notepage.clickOnAddNotebutton();
		String notetitlenew =ExcelUtility.getStringData(1, 0,"Notes")+FakerUtility.randomNumberGenerator();
		String notedescription=ExcelUtility.getStringData(1, 1,"Notes");
		String path=System.getProperty("user.dir")+prop.getProperty("uploadfilepath");
		System.out.println(path);
		notepage.addNote(notetitlenew, notedescription,path);
		notepage.searchNoteAdded(notetitlenew);
		String notetext=notepage.getNoteAdded();
		Assert.assertEquals(notetext, notetitlenew);
	}
}