package com.demo;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TrialPhantomJS {
	
	

      
			
		 @Test
		 public void userlogin() throws InterruptedException
		 {		 WebDriver driver;
		   System.setProperty("phantomjs.binary.path", "/home/ajay/Downloads/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");		
	          driver = new PhantomJSDriver();	
	          driver.manage().window().maximize();
		 
		 driver.get("https://in.yahoo.com/?p=us");
		 driver.findElement(By.id("uh-signin")).click();
		 System.out.println("hello");
		 
		 Thread.sleep(5000);
		 

		 driver.findElement(By.name("username")).sendKeys("autotesting4@yahoo.com");
		 
	
		
		 driver.findElement(By.name("signin")).click(); // click on next
		 System.out.println("shobhn1");
		 Thread.sleep(5000);
		 driver.findElement(By.id("login-passwd")).sendKeys("selenium12345");
		 System.out.println("shobhn2");
		 driver.findElement(By.name("verifyPassword")).submit();
		 System.out.println("shobhn3");
		 System.out.println("login sucessfull");
		 driver.getCurrentUrl();
         }

}
