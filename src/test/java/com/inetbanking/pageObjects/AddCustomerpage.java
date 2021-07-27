package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {

	WebDriver driver;
	
	public AddCustomerpage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="New Customer")
	@CacheLookup
	WebElement linkAddnewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement CustName;
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement rdgender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement dateofbirth;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement pin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submit;
	
	public void setcustomername(String cname)
	{
		CustName.sendKeys(cname);
	}
	
	public void clickgender(String cgender)
	{
		rdgender.click();
	}
	
	public void clickaddnewcust()
	{
		linkAddnewCustomer.click();
	}
	
	public void setdateofbirth(String mm,String dd, String yy)
	{
		dateofbirth.sendKeys(mm);
		dateofbirth.sendKeys(dd);
		dateofbirth.sendKeys(yy);
	}
	
	public void setaddress(String add)
	{
		address.sendKeys(add);
	}
	
	public void setcity(String cityy)
	{
		city.sendKeys(cityy);
	}
	
	public void setstate(String stat)
	{
		state.sendKeys(stat);
	}
	
	public void setpincode(int pincode)
	{
		pin.sendKeys(String.valueOf(pincode));
	}
	
	public void setphone(String phn)
	{
		mobile.sendKeys(phn);
	}
	
	public void setemail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setpassword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void clicksubmit()
	{
		submit.click();
		
	}
	
}
