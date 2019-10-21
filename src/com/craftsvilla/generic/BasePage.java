package com.craftsvilla.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	public Logger log = Logger.getLogger(BasePage.class);
	public WebDriver driver = null;
	
	public BasePage(WebDriver browser)
	{
		driver = browser;
	}
	
	
	public void verifyTitle(String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.titleContains(expectedTitle));
			String title = driver.getTitle();
			Assert.assertEquals(title, expectedTitle);
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	//VerifyElementPresent
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void mouseHover(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void click(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		}
		catch(Exception e)
		{
			
		}
	}
	
}
