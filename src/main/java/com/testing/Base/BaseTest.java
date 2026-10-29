package com.testing.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.training.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	PropertiesFile properties=new PropertiesFile();
	public WebDriver launchApplication()
	{

		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
		
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");
	       driver = new ChromeDriver(options);
	       driver.manage().window().maximize();
	       String applicationurl=properties.getproperties("url");
	driver.get(applicationurl);
	
	}
		return driver;

}
	public void closebrowser()
	{
		driver.quit();
		driver=null;
	}
}

