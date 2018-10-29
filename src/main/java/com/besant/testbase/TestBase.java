package com.besant.testbase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	public WebDriver driver=null; // 
	private static final Logger log = Logger.getLogger(TestBase.class.getName());//Creating object of logger class
	
	
	/**
	 **************************************************************************************************************
	 * Configuration of the Log4j 
	 **************************************************************************************************************
	 */
	@BeforeMethod
	public void configureLog4j() {
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);//just read all the configurations set in log4j
	}
	
	
	public void init(String browserName,String url) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
	        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			
			// Create or launch the chromedriver
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/drivers/firefoxdriver.exe");
				
				// Create or launch the chromedriver
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			/*
			 * code to launch the IE driver
			 */
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}
		

	
	
	
	

}
