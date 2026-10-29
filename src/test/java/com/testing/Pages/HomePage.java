package com.testing.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testing.Base.BasePage;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	public void clickHome()
	{
		waitforelement(home);
		home.click();
	}
	@FindBy(id="name")
	WebElement firstname;
	public void enterfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	@FindBy(id="lname")
	WebElement lastname;
	public void enterlastname(String lname)
	{
	     lastname.sendKeys(lname);
	}
	@FindBy(xpath="//input[@value='female']")
	WebElement gender;
	public void entergender()
	{
	     gender.click();
	}
	
@FindBy(xpath="//div[@class='col-75']/select[@name='city']/option")
List<WebElement>l1;

public void selectcity(String choosecity)
{
	for(WebElement city1:l1)
	{
		System.out.println(city1.getText());
		if(city1.getText().equalsIgnoreCase(choosecity))
		{
			city1.click();
		
			break;
		}
		}
}		
	@FindBy(id="course")
	WebElement course;
public void selectcourse(String course1)
{
	
	Select coursedropdown=new Select(course);
	coursedropdown.selectByValue(course1);
}
	
	@FindBy(xpath="//button[@onclick='ClearFields()']")
	WebElement submit;
	public void clickonsubmit()
	{
		
	submit.click();

	}

}
