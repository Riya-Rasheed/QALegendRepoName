package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendNoteTest extends BaseClass
{
	@Test
	public void addNoteTest() throws IOException 
	{
	loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	homepage.clickOnHomePageNoteButton();
	notepage.clickOnAddNotebutton();
	String notetitlenew =ExcelUtility.getStringData(1, 0, "Notes")+FakerUtility.randomNumberGenerator();
	String notedescription=ExcelUtility.getStringData(1, 1, "Notes");
	notepage.addNote(notetitlenew, notedescription);
	notepage.searchNoteAdded(notetitlenew);
	String notetext=notepage.getNoteAdded();
	Assert.assertEquals(notetext, notetitlenew);
	}

}
