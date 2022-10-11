package com.SauceDemo.utilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass
{

	public static void takeScreenshot(WebDriver Driver,String Name ) throws IOException
	{
		{
			Date d = new Date();
			DateFormat d1 = new SimpleDateFormat("dd-MM & HH-mm");
			String date = d1.format(d);
			
			TakesScreenshot ts= (TakesScreenshot)Driver;
			File seleFile = ts.getScreenshotAs(OutputType.FILE);
			File myFile = new File("./ScreenshotFolder\\SauceDemo" + Name + date + ".jpg");
			FileHandler.copy(seleFile, myFile);
		}

	}
	
	
}
