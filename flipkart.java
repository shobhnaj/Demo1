package com.demo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class flipkart{
	WebDriver driver;
  @Test
  public void flipkartmobilesearch() throws InterruptedException
  {
	  driver.findElement(By.xpath("//*[@title='Search for Products, Brands and More']")).sendKeys(Keys.ENTER,"mobile");
	  System.out.println("hello");
	  WebElement srch = driver.findElement(By.xpath("//*[@data-reactid='46']"));
	  srch.click();
	  System.out.println("shobhna");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[text()='Moto E3 Power (Black, 16 GB)']")).click();
	  String parent_window = driver .getWindowHandle();
	  
	    for(String child_window : driver.getWindowHandles())
		  { 
		  driver.switchTo().window(child_window);
		  Thread.sleep(4000);
		  String result = driver.getCurrentUrl();
		  System.out.println(result);
		  }		  
	  
	  
	 // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	  System.out.println("3rd page ");
	  Thread.sleep(4000);
	  System.out.println("innotical");
  }
  @BeforeTest
  public void startingapp() {
	  System.setProperty("webdriver.chrome.driver","/home/ajay/Downloads/chromedriver");
	  driver = new ChromeDriver();	
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
  }

 

}

