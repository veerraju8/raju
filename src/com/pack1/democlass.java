package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class democlass
{
	@Test
	public  void main()
	{
	WebDriver driver=new FirefoxDriver();
	         driver.get("https://www.facebook.com");
	}

}
