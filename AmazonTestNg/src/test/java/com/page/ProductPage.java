package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage 
{

	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement clickproductdetail;
	
	
	public void productdetail()
	{
		clickproductdetail.click();
	}

	

}
