package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div/div/h1")
	private WebElement welcomeBtn;
	
	WebDriver driver = null;
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public String get_text_from_welcome_btn() throws InterruptedException {
		Thread.sleep(4000);
		String welcomeText = welcomeBtn.getText();
		return welcomeText;
	}
}
