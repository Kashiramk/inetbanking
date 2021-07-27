package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.AddCustomerpage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_002 extends BaseClass{
	
	@Test	
	public void AddNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		Thread.sleep(3000);
		AddCustomerpage ac=new AddCustomerpage(driver);
		ac.clickaddnewcust();
		ac.setcustomername("sunnyk");
		ac.clickgender("male");
		ac.setdateofbirth("09","23","1997");
		ac.setaddress("Dhankawadi");
		ac.setcity("Pune");
		ac.setstate("maharashtra");
		ac.setpincode(411043);
		ac.setphone("9923539661");
		
		//String email=randomstring()+"gmail.com";
		ac.setemail("sunny321@gmail.com");
		ac.setpassword("sunny@1234");
		ac.clicksubmit();
		Thread.sleep(3000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver ,"AddNewCustomer");
			Assert.assertTrue(false);
		}
	}
	

}
