package com.SauceDemo.POMClasses;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homealertclass 
{
	//1. Web driver declare
			private WebDriver driver;
	        private Alert alt;
	        
   //2. find element 
			@FindBy(xpath = "//button[@id='confirmButton']")
			private WebElement Alertbutton;
			
   //3.create method
			public void ClickAlertpopup()
			{
				Alertbutton.click();
				alt = driver.switchTo().alert();
				alt.accept();
			}
   //4. create constructor
			public homealertclass(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
				
			}
			
			
}
