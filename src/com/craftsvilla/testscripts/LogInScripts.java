package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.SignInPage;

public class LogInScripts extends BaseTest
{
	HomePage hp = new HomePage(driver);
	SignInPage sp = new SignInPage(driver);
	
	@Test
	public void tc_01_logInToApp()
	{
		try
		{
			String[][] credentials = ReadExcel.getData(FILE_PATH, "Sheet1");
			for(int i =1; i<credentials.length; i++ )
			{
				/*for(int j = 0; j<credentials[0].length;j++)
				{
					
				}*/
				
				String email = credentials[i][0];
				String password = credentials[i][1];
				
				hp.clickOnSignInLink();
				sp.setEmail(email);
				sp.clickOnContinue();
				sp.enterPassword(password);
				sp.clickOnLoginButton();
				hp.gotoAccount();
				hp.clickOnLogout();
				hp.verifyTitle("Ethnic Wear - Buy Ethnic Wear in Latest Designs Online at Craftsvilla");
				logger.info("TC_01 has been executed successfully");
				
			}
			
		}
		catch(Exception e)
		{
			logger.error("TC_01 has failed");
		}
		
		
	}
	
	public void tc_02()
	{
		
	}
	

}
