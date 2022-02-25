package com.simplilearn.capstoneproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {

     static WebDriver driver = null;
 
    @BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/medicare/");
    }
	
    @AfterMethod
    public void quitDriver() throws InterruptedException {
    	Thread.sleep(4000);
    	driver.quit();
    }
}
