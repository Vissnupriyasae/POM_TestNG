package com.priya.pages.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.priya.pages.HomePage;

public class test_HomePage {
	
	WebDriver driver;
	HomePage homepage;
	
	@BeforeTest

    public void setup(){

		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
		
	    driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://ercot.com");
        
        homepage = new HomePage(driver);

    }
	
	@Test(priority=0)
	
	public void verifyTitleText()
	{
		
		String titleText = homepage.getTitleText();
		Assert.assertEquals(titleText, "Electric Reliability Council of Texas (ERCOT)");
		
	}

}
