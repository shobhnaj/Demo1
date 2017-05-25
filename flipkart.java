package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class flipkart{
	WebDriver driver;
  @Test
  public void flipkartmobilesearch()
  {
	  driver.findElement(By.xpath("//*[@title='Search for Products, Brands and More']")).sendKeys(Keys.ENTER,"mobile");
	  System.out.println("hello");
	  WebElement srch = driver.findElement(By.xpath("//*[@data-reactid='46']"));
	  srch.click();
	  System.out.println("shobhna");
	  String result = driver.getCurrentUrl();
	  System.out.println(result);
  }
  @BeforeTest
  public void startingapp() {
	  System.setProperty("phantomjs.binary.path", "/home/ajay/Downloads/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
	  driver = new PhantomJSDriver();	
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}

