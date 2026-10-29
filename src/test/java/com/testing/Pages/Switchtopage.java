package com.testing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.testing.Base.BasePage;

public class Switchtopage extends BasePage
{
public Switchtopage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//button[(contains(text(),'Switch To'))]")
WebElement switchtab;
public void mousehoveronswitch()
{  waitforelement(switchtab);
	Actions action=new Actions(driver);
	action.moveToElement(switchtab).build().perform();
}
@FindBy(xpath=("//a[text()='Alert']"))
WebElement alert;
public  void clickonalert()
{

		alert.click();

}
@FindBy(xpath=("//button[text()='Window Alert']"))
	WebElement windowalert;
public void clickonwindowalert()
{
	windowalert.click();
	driver.switchTo().alert().dismiss();
}

@FindBy(xpath="//button[text()='Promt Alert']")
WebElement prompt;
public  void promptalert()
{
	
	prompt.click();
	driver.switchTo().alert().sendKeys("pushpa");
	driver.switchTo().alert().accept();
}
}