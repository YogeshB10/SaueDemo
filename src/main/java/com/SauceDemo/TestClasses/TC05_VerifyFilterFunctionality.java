package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;

public class TC05_VerifyFilterFunctionality 
{
public static void main(String[] args)  
{
	
	System.setProperty("webdriver.edge.driver","C:\\WebDriver\\BrowserDriver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("SauceDemo URL is opened");
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//loginActivity
	LoginPOMClass lp = new LoginPOMClass(driver);
	lp.sendUsername();
	lp.sendPassword();
	lp.clickOnLoginButton();
	System.out.println("login activity is performed");
	
//	check  filter
	HomePOMClass hp = new HomePOMClass(driver);
	hp.clickDropDownFilter();
	System.out.println("Filter is changed");
	
	//--validation--//
	
	
	
	
	driver.quit();
    System.out.println("browser is closed");
       
    System.out.println("end of Program");
	
	
}
}
