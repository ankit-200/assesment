 package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
	static WebDriver driver;
	public static  void createDriver()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium 4.1.2\\driver\\chromedriver_win32 (4)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}
	
	public static WebDriver getdriver()
	{
		if(driver==null)
		{
			createDriver();
		}
		return driver;
	}

}
