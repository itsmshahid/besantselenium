package com.uipages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.besant.testbase.TestBase;
import com.relevantcodes.extentreports.ExtentTest;
import com.test.AutomationPractice;

public class HomePage extends TestBase{
	private static final Logger log = Logger.getLogger(HomePage.class.getName());
	
	
	//concept of page factory
	
	//Class constructor
		public HomePage(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
		
		

		/**
		 ******************************************************************************************************
		 * Web Elements of Home page
		 ******************************************************************************************************
		 */

			
		@FindBy(xpath = "//a[@class='login' and @title='Log in to your customer account']")
		public WebElement signinButton;
		
		
		
		public void clickOnSigninButton() {
			signinButton.click();
			
			log.info("Clicked on Singin button in Home page");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
