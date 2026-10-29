package com.testing.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.Base.BaseTest;
import com.testing.Pages.HomePage;
import com.testing.Pages.LoginPage;
import com.training.utilities.ScreeshotUtility;

public class HomeTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	HomePage home;
	ScreeshotUtility screenshot;
	String method ;
	
	@BeforeMethod
	public void launch()
	{
		driver=launchApplication();
		screenshot=new ScreeshotUtility();
		loginpage=new LoginPage(driver);
		home=new HomePage(driver);
	}
	@Test
	public void hometest()
	{
		loginpage.enteruserdetails("admin123@gmail.com");
		
		loginpage.enterPassword("admin123");
		
		loginpage.clickonloginButton();
		
		home.clickHome();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
		home.enterfirstname("pushpa");
		home.enterlastname("RajaRao");
		home.selectcity("new delhi");
		home.selectcourse("btech");
		home.entergender();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
		home.clickonsubmit();
		
	}
	
	@AfterMethod
	public void teardown()
	{
	
		 closebrowser();
	}
	
}
