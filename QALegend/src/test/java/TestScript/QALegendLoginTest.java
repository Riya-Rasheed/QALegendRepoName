package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;

public class QALegendLoginTest extends BaseClass
{	@Test
	public void checkValidLogin()
	{
		
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(homepage.checkforProfileName(), true);
		
	}
	@Test
	public void checkinValidLogin() throws IOException
	{
		System.out.println("invalid");
		for(int i=1;i<=3;i++)
		{
			String userName = ExcelUtility.getStringData(i, 0, "Login");
			String pwd = ExcelUtility.getStringData(i, 1, "Login");
			System.out.println(userName);
			System.out.println(pwd);
			loginpage.login(userName, pwd);
			Assert.assertEquals(loginpage.checkforInvalidLogin(), true);
		}
	}
}
