package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.ExcelUtility;

public class QALegendMessageTest extends BaseClass
{
	@Test
	public void verifyComposeMessage() throws IOException, InterruptedException
	{
			loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
			homepage.clickOnHomePageMessageButton();
			String Tomailid =ExcelUtility.getStringData(1, 0, "Messages");
			String subject=ExcelUtility.getStringData(1, 1, "Messages");
			String messagearea=ExcelUtility.getStringData(1, 2, "Messages");
			messagepage.addMessage(Tomailid, subject, messagearea);
			messagepage.getMessageOnSentItems(subject);
	}
	
}
