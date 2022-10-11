package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;



public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	
		
		
		//--homePage--
		@Test
		public void verifyLoginFunctionality() 
		{
			log.info("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA
		
	   String actualTitle = driver.getTitle();
	   log.info(actualTitle);
	   
	   Assert.assertEquals(actualTitle, expectedTitle);
	
//	   if(expectedTitle.equals(actualTitle))
//	   {
//		   System.out.println("login functionality test case is passed");
//	   }
//	   else
//	   {
//		   System.out.println("login functionality test case is failed");
//	   }
		}
		
		
		
		
	
}
