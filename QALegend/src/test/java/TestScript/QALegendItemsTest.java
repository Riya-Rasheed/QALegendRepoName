package TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendItemsTest extends BaseClass
{
	@Test
	public void addItem() throws IOException, InterruptedException 
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnHomePageItemsButton();
		itemspage.clickOnAddItemButton();
		String itemsTitle = ExcelUtility.getStringData(1, 0, "Items")+FakerUtility.randomNumberGenerator();
		String itemsDescription = ExcelUtility.getStringData(1, 1,"Items" );
		String itemsRate = ExcelUtility.getNumericData(1, 2,"Items" );
		itemspage.addItem(itemsTitle, itemsDescription,  itemsRate);
		itemspage.searchItemAdded(itemsTitle);
		
		
		
		
		
		
		
		
		
	}

}
