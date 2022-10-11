package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;
import com.SauceDemo.utilityClasses.ScreenshotClass;




public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	
		
		@Test
		public void verifyLogoutFunctionality() throws InterruptedException, IOException
		{
			
			
			log.info("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA
			
		   String actualTitle = driver.getTitle();
		   Assert.assertEquals(actualTitle, expectedTitle);
		
//		   if(expectedTitle.equals(actualTitle))
//		   {
//			   System.out.println("logOut functionality test case is passed");
//		   }
//		   else
//		   {
//			   System.out.println("logOut functionality test case is failed");
//		   }
	      }
	
	

	       
	


}
