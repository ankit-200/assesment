package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	

	@FindBy(id="twotabsearchtextbox")
	private WebElement clickOnsearchfield;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement clickOnsearchbutton;
	
	public void searchfield(String str)
	{
		clickOnsearchfield.sendKeys(str);
	}
	
	public void searchbutton()
	{
		clickOnsearchbutton.click();
	}


}
