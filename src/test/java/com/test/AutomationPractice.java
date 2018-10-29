package com.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.besant.testbase.TestBase;
import com.uipages.HomePage;

public class AutomationPractice extends TestBase{
    	private static final Logger log = Logger.getLogger(AutomationPractice.class.getName());
	
	
	
	@Test
	public void testCase1() {
		
		init("chrome","http://automationpractice.com");// launch browser and navigate
		
        HomePage homepage = new HomePage(driver);
        homepage.clickOnSigninButton();
        
        log.info("shahid");
        log.info("i am using log 4j logger");
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//    	
//    	//click on Singin
//    	
//    	
//    	
//    	signinButton.click();
//    	
//    	driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("shahidbit8994@gmail.com");
//    	driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
//    	
//    	driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
//    	driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("shahid");
//    	
//    	driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("md");
//    	
//    	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("123456");
//    	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("123456");
//    	
//    	
//    	 WebElement daysDropdown = driver.findElement(By.xpath("//select[@id='days']"));
//    	
//    	
//		s = new Select(daysDropdown);
//		s.selectByValue("17");
//		
//		System.out.println("CCCCCCCCCCCCCCCCC");
//		
//		driver.findElement(By.xpath("//select[@id='months']")).click();
//		
//		s= new Select(driver.findElement(By.xpath("//select[@id='months']")));
//		s.selectByIndex(6);
//		
//		System.out.println("CCCCCCCCCCCCCCCCC");
//		
//		s= new Select(driver.findElement(By.xpath("//select[@id='years']")));
//		s.selectByIndex(2);
//		
//		
//		driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("some name");
//		
//		driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("lastname");
//		
//		driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys("Add 1");
//		
//		
//		driver.findElement(By.xpath(".//*[@id='city']")).sendKeys("Bangalore");
//		
//		
//		s = new Select(driver.findElement(By.xpath(".//*[@id='id_state']")));
//		s.selectByIndex(4);
//		
//		
//		driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys("00000");
//		
//		driver.findElement(By.xpath(".//*[@id='phone_mobile']")).sendKeys("987987979878");
//		
//		driver.findElement(By.xpath(".//*[@id='submitAccount']")).click();
//
//		
//		String expectedoutcome = driver.findElement(By.xpath(".//*[@id='center_column']/h1")).getText();
//		
//		
//		System.out.println(expectedoutcome);
//		
//		
//		Assert.assertEquals(expectedoutcome, "MY ACCOUN");
//		
//		
//		
//		//driver.quit();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 WebElement monthDropdown = driver.findElement(By.xpath("//select[@id='months']"));
//		Select s1 = new Select(monthDropdown);
//		
//		
//		
//		List<WebElement> allvalues = s1.getOptions();
//		for(int i=0;i<allvalues.size();i++) {
//			System.out.println(allvalues.get(i).getText());
//		}
		
		
		
		
	}

}
