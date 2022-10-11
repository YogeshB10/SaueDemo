package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;



public class TC04_VerifyAllProductFunctionality extends TestBaseClass
{
	
	
	@Test
	public void verifyAllProductFunctionality() 
	{
		//bag product
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickAllProducts();
		System.out.println("All products will get selected");
			
			//--validation--//
			String exceptedProduct = "6";
			
			String actualProduct = hp.getTextFromAddToCart();
			log.info("actual product->"+actualProduct);
			
			log.info("apply validation");
			Assert.assertEquals(actualProduct, exceptedProduct);
//			if(exceptedProduct.equals(actualProduct))
//			{
//				System.out.println("All products add to cart case is passed");
//			}
//			else
//			{
//				System.out.println("All products add to cart case is failed");
//			}
	}
	
	
}
	
	
	
	
	

	

