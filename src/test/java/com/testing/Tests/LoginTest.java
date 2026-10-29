package com.testing.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.Base.BaseTest;
import com.testing.Pages.LoginPage;
import com.training.utilities.ScreeshotUtility;

public class LoginTest  extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	ScreeshotUtility screenshot;
	String method;
	@BeforeMethod
	public void launch()
	{
		driver=launchApplication();
		
		loginpage=new LoginPage(driver);
		screenshot=new ScreeshotUtility();
	}
	@Test
	public void LoginWithValidCredentials()
	{
		loginpage.enteruserdetails("admin123@gmail.com");
		
		loginpage.enterPassword("admin123");
		
	
		
		loginpage.clickonloginButton();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
	}
	public void LoginWithInvalidCredentials()
	{
		loginpage.enteruserdetails("admin1234@gmail.com");
		loginpage.enterPassword("admin123");
		loginpage.clickonloginButton();
	}
	
	public void LoginWithNoPassword()
	{
		loginpage.enteruserdetails("admin1234@gmail.com");
		
		loginpage.clickonloginButton();
		//method=Thread.currentThread().getStackTrace()[1].getMethodName();
		//screenshot.takeScreenshot(driver, method);
	}
	

@AfterMethod
public void teardown()
{
	
	
	closebrowser();
	
}
}
