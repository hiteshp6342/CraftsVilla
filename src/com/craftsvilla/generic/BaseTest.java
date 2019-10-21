package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConst
{
	
	protected Logger logger = Logger.getLogger(BaseTest.class);
	public static WebDriver driver = null;
	public WebDriverWait wait = null;
	
	//Launch Browser
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();	
		}
				
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else	
		{
			Reporter.log("Invalid browser selection");

		}
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(APP_URL);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
