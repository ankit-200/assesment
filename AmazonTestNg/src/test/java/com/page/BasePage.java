package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.generic.DriverUtil;

public class BasePage {
	WebDriver driver;
	public BasePage()
	{
		driver=DriverUtil.getdriver();
		PageFactory.initElements(driver, this);
	}

}
