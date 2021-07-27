package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{

	@Test
	public void loginTest() throws IOException
	{
		
		
		logger.info("url opened");
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		
		logger.info("Entered username");
		lp.setpassword(password);
		
		logger.info("entered Password");
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test pass");
		}
		else
		{
			captureScreen(driver,"Logintest");
			Assert.assertTrue(false);
			
			logger.info("login test fail");
		}
		
	}
}
