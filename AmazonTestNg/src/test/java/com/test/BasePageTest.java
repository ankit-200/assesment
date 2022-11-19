package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.generic.DriverUtil;

public class BasePageTest {
	
	WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		DriverUtil.createDriver();
		DriverUtil.getdriver().get("https://www.amazon.in/");
	}


}
