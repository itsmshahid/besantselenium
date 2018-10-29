package com.uipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.besant.testbase.TestBase;

public class SignInPage extends TestBase{
	
	//concept of page factory
	
		//Class constructor
			public SignInPage(WebDriver driver) {
				
				this.driver = driver;
				PageFactory.initElements(driver, this);

			}
			
			
		/*
		 * Create your methods and web elements below.
		 * And call the methods in your test case
		 */

}
