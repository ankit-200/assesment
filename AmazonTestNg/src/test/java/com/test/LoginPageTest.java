package com.test;

import org.testng.annotations.Test;

import com.page.LoginPage;

public class LoginPageTest extends BasePageTest{
	
	@Test
	public void verifyLogin()
	{
		LoginPage lp=new LoginPage();
		lp.signin();
		lp.username("ankitmishratech207@gmail.com");
		lp.continuebutton();
		lp.password("ankit9074");
		lp.signinbutton();
		
		
		
	}


}
