package com.testing.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.testing.Pages.WebDriverWait;

public class BasePage {
	 protected WebDriver driver;

public BasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	// TODO Auto-generated constructor stub
	/*pagefactory one line of syntax
	 *  "Take all the @FindBy elements in this class, and connect them to the br
	 browser using this drivern nnnn                                                          
	 */
}

public void waitforelement(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(element));

}
}