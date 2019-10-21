package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.CheckOutPage;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.LinenSareesPage;
import com.craftsvilla.pompages.ProductDescriptionPage;
import com.craftsvilla.pompages.SareesPage;

public class LinenSareesScripts extends BaseTest
{
	
	HomePage hp = new HomePage(driver);
	SareesPage sp = new SareesPage(driver);
	LinenSareesPage lp  = new LinenSareesPage(driver);
	ProductDescriptionPage pd = new ProductDescriptionPage(driver);
	CheckOutPage cp =new CheckOutPage(driver);
	
	@Test
	public void tc_01_buyAProduct()
	{
		try
		{
			hp.goToSareesLink();
			sp.clickOnLinenSarees();
			lp.goToProduct1537544423();
			pd.clickOnBuyNow();
			cp.setMobile("9663069665");
			cp.captureOTPMessage();
			cp.setOTP("7070");
			cp.clickOnLogin();
			
			logger.info("Test case TC_01 has been executed successfully");			
		}
		catch(Exception e)
		{
			logger.error("Test case TC_01 failed"+e);
		}
	}

}
