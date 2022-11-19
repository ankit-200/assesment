package com.test;

import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.LoginPage;
import com.page.ProductPage;

public class ProductPageTest extends BasePageTest {
	
	@Test
	public void verifyproductpage()
	{
		
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		ProductPage pp=new ProductPage();
		lp.signin();
		lp.username("ankitmishratech207@gmail.com");
		lp.continuebutton();
		lp.password("ankit9074");
		lp.signinbutton();
		hp.searchfield("Mobile");
		hp.searchbutton();
		pp.productdetail();
	}


	
}
