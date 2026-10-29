package com.testing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.testing.Base.BasePage;

public class Calculatortestpage extends BasePage{
	
	public  Calculatortestpage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[text()='Calculator']")
	WebElement calculatorbutton;
	public void calculatorbutton()
	{    waitforelement(calculatorbutton);
		calculatorbutton.click();
	}
	
@FindBy(xpath="//form//input[@value='8']")
WebElement eightbutton;
public void eightbuttonclick()
{
	eightbutton.click();
}
@FindBy(xpath="//form//input[@value='x']")
WebElement starsign;
public void clickonstarsignbutton()
{
	starsign.click();
}
@FindBy(xpath="//form//input[@value='7']")
WebElement sevenbutton;
public void sevenbuttonclick()
{
	sevenbutton.click();
}
@FindBy(xpath="//form//input[@value='=']")
WebElement equalsbutton;
public void clickonequals()
{
	equalsbutton.click();
}
	@FindBy(id="display")
	WebElement result;
	public void getresult()
	{
		
        System.out.println( "result is"+result.getAttribute("value"));
	}
}



