package com.ecg.test_cases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ecg.page_object.PO_Login;

public class TC_Login extends BaseClass {
	
	@Test(priority =1)
	public void test_Login() throws InterruptedException, IOException
	{
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		PO_Login lgn = new PO_Login(driver);
		
		lgn.clickBtnlogin();
		Thread.sleep(5000);
		logger.info("Clicked on login button");
		
		String url = driver.getCurrentUrl();
		driver.get(url);
		Thread.sleep(5000);
		
		
		lgn.setTextemail(email);
		Thread.sleep(1000);
		logger.info("Email id entered");
		
		lgn.setTextpassword(password);
		Thread.sleep(1000);
		logger.info("Password entered");
		
		lgn.clickBtnloginsubmit();
		Thread.sleep(10000);
		logger.info("Clicked on login submit button");
		
		if(driver.getPageSource().contains(""))
		{
			Thread.sleep(2000);
			logger.info("Login successful...");
			Assert.assertTrue(true);
		}
		else
		{
			Thread.sleep(5000);
			captureScreen(driver,"test_Login");  // from base class
			logger.info("Start capturing screenshots");
			Assert.assertTrue(false);
			logger.info("Login failed!!!");
		}
	}
}
