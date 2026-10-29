package com.training.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreeshotUtility {
	WebDriver driver; 
	public void takeScreenshot(WebDriver driver,String method)
	{
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		//Take Screenshot is a interface 
		File scrnfile=screenshot.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    String filepath = "Screenshots" + File.separator + "screenshot_" + method + "_" + timestamp + ".jpeg";
		

		File destination=new File(filepath);
		try {
			FileUtils.copyFileToDirectory(scrnfile, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 