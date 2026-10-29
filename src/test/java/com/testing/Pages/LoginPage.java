package com.testing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.testing.Base.BasePage;

public class LoginPage extends BasePage{
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		
		}
	
	//findElements(by. replaced with @findby
	@FindBy(id="email_field")
	WebElement emailid;
	@FindBy(id="password_field")
	WebElement password;
	@FindBy(xpath="//button[text()='Login to Account']")
	WebElement loginButton;
	public void enteruserdetails(String username)
	{
		
		emailid.sendKeys(username);
	}
	public void enterPassword(String password1)
	{
		password.sendKeys(password1);
		
	}
	public void clickonloginButton()
	{
		loginButton.click();
	}

}
