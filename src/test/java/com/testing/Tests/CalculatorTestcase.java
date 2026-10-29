package com.testing.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.Base.BaseTest;
import com.testing.Pages.Calculatortestpage;
import com.testing.Pages.LoginPage;
import com.training.utilities.ScreeshotUtility;

public class CalculatorTestcase  extends BaseTest{
	WebDriver driver;
	LoginPage login;
	ScreeshotUtility screenshot;
	Calculatortestpage calculatorpage;
	String method;
	@BeforeMethod
	public void LoginintoApplication()
	{
		driver=launchApplication();
		login=new LoginPage(driver);
		screenshot=new ScreeshotUtility();
		 calculatorpage=new Calculatortestpage(driver);
	}
	@Test
	public void Calculatortestcase()
	{
		login.enteruserdetails("admin123@gmail.com");
		
		login.enterPassword("admin123");
		
		login.clickonloginButton();
		calculatorpage.calculatorbutton();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
		calculatorpage.eightbuttonclick();
		calculatorpage.clickonstarsignbutton();
		calculatorpage.sevenbuttonclick();
		calculatorpage.clickonequals();
		calculatorpage.getresult();
		method=Thread.currentThread().getStackTrace()[1].getMethodName();
		screenshot.takeScreenshot(driver,method);
		
	}
	@AfterMethod
	public void teardown()
	{
		closebrowser();
		
	}

}
