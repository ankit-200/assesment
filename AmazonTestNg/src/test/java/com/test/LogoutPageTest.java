package com.test;

import org.testng.annotations.Test;

import com.page.LoginPage;
import com.page.LogoutPage;

public class LogoutPageTest extends BasePageTest {
	
	@Test
	public void verify_SignoutPage()
	{
		LoginPage lp=new LoginPage();
		LogoutPage log=new LogoutPage();
		lp.signin();
		lp.username("ankitmishratech207@gmail.com");
		lp.continuebutton();
		lp.password("ankit9074");
		lp.signinbutton();
		log.click_account_list();
		log.click_signout();
		
		
		
	}

}
