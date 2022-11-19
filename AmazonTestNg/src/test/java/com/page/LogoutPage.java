package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement account_list;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	
	
	public void click_account_list()
	{
		Actions act= new Actions(driver);
		act.moveToElement(account_list).perform();
	}
	
	public void click_signout()
	{
		signout.click();
	}

}
