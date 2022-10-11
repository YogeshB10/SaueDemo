package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClass;
import com.SauceDemo.POMClasses.LoginPOMClass;



public class TC03_BagProductAddToCartFunctionality extends TestBaseClass
{
	
		@Test
		public void verifyBagProductFunctionality()
		{
			//--homePage--//
			
			//bag product
			HomePOMClass hp = new HomePOMClass(driver);
			 hp.clickBagButton();
			System.out.println("Bag product will get selected");
		//--validation--//
		String exceptedProduct = "1";
		
		String actualProduct = hp.getTextFromAddToCart();
		log.info("actual product->"+actualProduct);
		
		log.info("apply validation");
		
		 Assert.assertEquals(actualProduct, exceptedProduct);
		 
//		if(exceptedProduct.equals(actualProduct))
//		{
//			System.out.println("Bag product add to cart case is passed");
//		}
//		else
//		{
//			System.out.println("Bag product add to cart case is failed");
//		}
		}
		
		
		

}
