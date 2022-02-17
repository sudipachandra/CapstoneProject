package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	@FindBy(xpath="//*[@id=\"firstName\"]")
	private WebElement firstName;
	@FindBy(xpath="//*[@id=\"lastName\"]")
	private WebElement lastName;
	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement email;
	@FindBy(xpath="//*[@id=\"contactNumber\"]")
	private WebElement contactNumber;
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement password;
	@FindBy(xpath="//*[@id=\"confirmPassword\"]")
	private WebElement confirmPassword;
	@FindBy(xpath="//*[@id=\"role1\"]")
	private WebElement userRole;
	@FindBy(xpath="//*[@id=\"registerForm\"]/div[8]/div/button")
    private WebElement nextBilingBtn;
    
	WebDriver driver = null;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void give_information_to_signup() throws InterruptedException {
		Thread.sleep(6000);
		firstName.sendKeys("sriyansh");
		lastName.sendKeys("chandra");
		email.sendKeys("sc@gmnail.com");
		contactNumber.sendKeys("1234567");
		password.sendKeys("abcd");
		confirmPassword.sendKeys("abcd");
		userRole.click();
		Thread.sleep(4000);
		nextBilingBtn.click();
	}
	
}
