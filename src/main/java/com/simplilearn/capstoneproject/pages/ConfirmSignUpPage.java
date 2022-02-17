package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSignUpPage {

	@FindBy(xpath="/html/body/div[2]/div[1]/div/div[2]/div/div/a")
	private WebElement confirmBtn;
	
	WebDriver driver = null;
	public ConfirmSignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public WelcomePage click_confirm() throws InterruptedException {
		Thread.sleep(4000);
		confirmBtn.click();
		return new WelcomePage(driver);
	}
}
