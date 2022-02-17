package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedOutHomePage {

	@FindBy(xpath="//*[@id=\"login\"]/a")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"signup\"]/a")
	private WebElement signupBtn;
	
	@FindBy(xpath="//*[@id=\"listProducts\"]/a")
	private WebElement viewProductBtn;
	
	private WebDriver driver = null;
	
	public LoggedOutHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage clickOnLogin() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginBtn.click();
		return new LoginPage(driver);
	}
	
	public SignUpPage clickOnSignUp() throws InterruptedException {
//		Actions act =  new Actions(driver);
//		act.moveToElement(signupBtn).click().perform();
//		System.out.println("sign up clicked");
		Thread.sleep(4000);
		signupBtn.click();
//		System.out.println("sign up clicked");
		return new SignUpPage(driver);
	}
	
	public void clickOnViewProduct() throws InterruptedException {
		Thread.sleep(4000);
		viewProductBtn.click();
		
	}
	
}
