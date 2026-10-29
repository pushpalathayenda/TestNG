package com.testing.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.Base.BasePage;
import com.testing.Base.BaseTest;
import com.testing.Pages.LoginPage;
import com.testing.Pages.Switchtopage;
import com.training.utilities.ScreeshotUtility;

public class SwitchtoTestcase extends BaseTest {
    WebDriver driver;
    Switchtopage switchto;
    LoginPage loginpage;
    ScreeshotUtility screenshot;
    String method;

	@BeforeMethod
	public void loginapplication()
	{
		driver=launchApplication();
		
		loginpage=new LoginPage(driver);
		switchto=new Switchtopage(driver);
		screenshot=new ScreeshotUtility();
		
		
		
	}
	@Test
	public void Switchtotabtestcase()
	{
		loginpage.enteruserdetails("admin123@gmail.com");
           loginpage.enterPassword("admin123");
		
		loginpage.clickonloginButton();
		
		
		switchto.mousehoveronswitch();
		switchto.clickonalert();
		switchto.clickonwindowalert();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
		switchto.promptalert();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
	}
	@AfterMethod
	public void teardown()
	{
		
		 closebrowser();
}
}
