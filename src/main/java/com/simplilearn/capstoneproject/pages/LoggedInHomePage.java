package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInHomePage {

	@FindBy(xpath="//*[@id=\"dropdownMenu1\"]")
	private WebElement loginUserName;
	@FindBy(xpath="//*[@id=\"logout\"]/a")
	private WebElement logoutBtn;
	
	//public String userName = loginUserName.getText();
	

	WebDriver driver = null;
	public LoggedInHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public String get_username() throws InterruptedException {
		Thread.sleep(4000);
		String userName = loginUserName.getText();
		return userName;
	}
	
	public LoginPage click_logout() throws InterruptedException {
		loginUserName.click();
		Thread.sleep(4000);
		logoutBtn.click();
		return new LoginPage(driver);
	}
	
	
}
