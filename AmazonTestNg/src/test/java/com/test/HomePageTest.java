package com.test;

import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.LoginPage;

public class HomePageTest extends BasePageTest {
	
	@Test
	public void verifyHome()
	{
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		lp.signin();
		lp.username("jadhav6635@gmail.com");
		lp.continuebutton();
		lp.password("Amazon@123");
		lp.signinbutton();
		hp.searchfield("Mobile");
		
	}


}
