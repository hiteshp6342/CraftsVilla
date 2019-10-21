package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;



public class EmbroidedSareesPage extends BasePage
{
	@FindBy(xpath="//img[contains(@src,'1538760092-Craftsvilla_1.jpg')]")
	private WebElement product_1538760092;
	
	@FindBy(xpath="//img[contains(@src,'1538759448-Craftsvilla_1.jpg')]")
	private WebElement product_1538759448;
	
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement priceOrder;
	
	
	public EmbroidedSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToProduct1538759448()
	{
		verifyElementPresent(product_1538759448);
		product_1538759448.click();
	}
	
	public void goToProduct1538760092()
	{
		verifyElementPresent(product_1538760092);
		product_1538760092.click();
	}
	
	public void changePriceOrder()
	{
		verifyElementPresent(priceOrder);
		priceOrder.click();
	}
}

