package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement clicksignin;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement enterusername;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement clickcontinuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement enterpassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement clicksigninbutton;
	
	
	public void signin()
	{
		clicksignin.click();
	}
	
	public void username(String str)
	{
		enterusername.sendKeys(str);
	}
	
	public void continuebutton()
	{
		clickcontinuebutton.click();
	}
	
	public void password(String str)
	{
		enterpassword.sendKeys(str);
	}
	
	public void signinbutton()
	{
		clicksigninbutton.click();
	}

	 
}
