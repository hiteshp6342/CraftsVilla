package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	
	@FindBy(linkText = "Cotton Sarees")
	private WebElement cottonSarees;
	
	@FindBy(linkText="Linen Sarees")
	private WebElement linenSarees;
	
	@FindBy(linkText="Chiffon Sarees")
	private WebElement chiffonSarees;
	
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}


	public boolean clickOnEmbroidedSarees()
	{
		verifyElementPresent(cottonSarees);
		cottonSarees.click();
		return true;
	}
	
	public boolean  clickOnLinenSarees()
	{
		verifyElementPresent(linenSarees);
		linenSarees.click();
		return true;
	}
	
	public boolean clickOnChiffonSarees()
	{
		verifyElementPresent(chiffonSarees);
		chiffonSarees.click();
		return true;
	}
}
