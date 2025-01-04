package Utilities;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities 
{
	private WebDriver driver;
	public PageUtilities(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnElement(WebElement element)
	{
		element.click();
	}
	public void clearTextBox(WebElement textbox)
	 {
		 textbox.clear();
	 }
	 public String readText(WebElement element)
	 {
		return element.getText();
		 
	 }
	 public String readAttribute(WebElement element,String attribute)
	 {
		return element.getAttribute(attribute);
		 
	 }
	public void selectByIndex(WebElement dropdown,int index)
	{
		Select drpdwn = new Select(dropdown);
		drpdwn.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement dropdown,String text)
	{
		Select drpdwn = new Select(dropdown);
		drpdwn.selectByVisibleText(text);
	}
	public void selectByValue(WebElement dropdown,String value)
	{
		Select drpdwn = new Select(dropdown);
		drpdwn.selectByValue(value);
	}
	public void drapAndDrop(WebElement source,WebElement destination)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination);
		action.build().perform();
	}
	public void mouseHover(WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void rightClick()
	{
		Actions action = new Actions(driver);
		action.contextClick().build().perform();
	}
	public void esckeyPress()
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
	}
	public void enterText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	 public void checkBoxClick(WebElement checkbox) 
	 {
		 checkbox.click();
	  }
	 public void radioButtonSelect(WebElement radioButton) 
	 {
	       radioButton.click();
	 }
	 public void navigateToChildWindow()
	 {
		 String parent = driver.getWindowHandle();
		 System.out.println(parent);
		 Set<String>tabs = driver.getWindowHandles();
		 Iterator<String>I1 = tabs.iterator();
		 while(I1.hasNext())
		 {
			 String childWindow = I1.next();
			 if(!parent.equals(childWindow))
			 {
				 driver.switchTo().window(childWindow);			
			  }
		 }
	}
	 public void alertAccept() 
	 {
		    driver.switchTo().alert().accept();
	 }
	 public void alertDismiss() 
	 {
		 driver.switchTo().alert().dismiss();;
	}
	 public void valueToAlert(String value)
	 {
		 driver.switchTo().alert().sendKeys(value);
	 }
	 public void navigateToParentWindow()
	 {
		 String parent = driver.getWindowHandle();	 
		driver.switchTo().window(parent); 
	 }
	public void javaScriptClick(WebElement element)
	{
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].click();",element);
	}
	public void scroll()
	{
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,1000)");
	}
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor jsc = (JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public void scrollToBottom(WebDriver driver) 
	{
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	public void navigateToPage(String page)
	{
		driver.navigate().to(page);
	}
	public void refreshPage()
	{
		driver.navigate().refresh();
	}
	public void backPage()
	{
		driver.navigate().back();
	}
	public void forwardPage()
	{
		driver.navigate().forward();
	}
	
	 public boolean isElementDisplayed(WebElement element) 
	 {
	        try 
	        {
	            return element.isDisplayed();
	        }
	        catch (NoSuchElementException e) 
	        {
	            return false;
	        }
	    }
	 public boolean isElementEnabled(WebElement element) 
	 {
	        try 
	        {
	            return element.isEnabled();
	        } 
	        catch (NoSuchElementException e) 
	        {
	            return false;
	        }
	    }
	 public boolean isElementSelected(WebElement element) 
	 {
	        try 
	        {
	            return element.isSelected();
	        }
	        catch (NoSuchElementException e) 
	        {
	            return false;
	        }
	  }
	  public void openUrl(WebDriver driver, String url) 
	 {
		    driver.get(url);
	}
	 public WebElement findElement(WebDriver driver, By locator) 
	 {
		    return driver.findElement(locator);
	}
	 public void sendKeysToElement(WebDriver driver, By locator, String value) 
	 {
		    WebElement element = findElement(driver, locator);
		    element.sendKeys(value);
	}
	
	 
	 public String getCurrentWindowHandle(WebDriver driver) 
	 {
		    return driver.getWindowHandle();
		}
	public void EnterKeyPress() 
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		
		
	}
	public void clickOnDownArrow() 
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN);
		action.build().perform();
		
	}
	public void pageDownKeyPress() {
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN);
		action.build().perform();
		
	}
	
	public void javascriptScrollElementToView(WebElement element)
	{
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void selectCheckbox(WebElement checkbox)
	{
		if (!checkbox.isSelected())
		{
		checkbox.click();
		}
	}
	
	public void clearTextField(WebElement element)
	{
		element.clear();
	}
	 
}
