package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;

public class TestBaseClass
{
	public WebDriver driver;
 public Logger log = Logger.getLogger("SauceDemo");
	@Parameters("browserName")
	
	@BeforeMethod
	public void setUp(String browserName) throws IOException 
	{
		if(browserName.equals("chrome"))
		{
        System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.edge.driver","./DriverFiles\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
		
		PropertyConfigurator.configure("Log4j.properties");
		log.info("browser is opened");
	
	
	driver.manage().window().maximize();
	log.info("browser is maximized");
	
	driver.get("https://www.saucedemo.com/");
	log.info("SauceDemo URL is opened");
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//take screenshot
		ScreenshotClass.takeScreenshot(driver,"LoginPage");
	
	//loginPage elements find +action perform
	
	LoginPOMClass x = new LoginPOMClass(driver);
	
	x.sendUsername();
	x.sendPassword();
	 ScreenshotClass.takeScreenshot(driver,"usernamepassword");
	x.clickOnLoginButton();
	
     ScreenshotClass.takeScreenshot(driver,"HomePage");
	}
	
	@AfterMethod
	public void logoutTest() throws InterruptedException, IOException
	{
	HomePOMClass y = new HomePOMClass(driver);
	y.clickMenuButton();
	ScreenshotClass.takeScreenshot(driver,"MenuButton");
	y.clickLogOutButton();
	ScreenshotClass.takeScreenshot(driver,"LoginPG");
	
   driver.quit();
   log.info("browser is closed");
   log.info("end of Program");
	}
}
