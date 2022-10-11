package com.SauceDemo.POMClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class alertwindow 
{
public static void main(String[] args) 
{
	

	System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\BrowserDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();		
	driver.get("https://demoqa.com/alerts");
	System.out.println("url is opened");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	

	
//	WebElement clickMe1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
//	clickMe1.click();
//	System.out.println("clicked on clickMe1 button");
	
	//alert will come
//	
//	Alert alt = driver.switchTo().alert();
//	
//	//ok button click	
//	alt.accept();
	
	homealertclass ha = new homealertclass(driver);
	ha.ClickAlertpopup();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
