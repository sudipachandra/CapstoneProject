package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement usernameField;
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement passwordField;
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/div/input[2]")
	private WebElement loginBtn;
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/div[3]/div/a")
	private WebElement registerHereBtn;
	@FindBy(xpath="/html/body/div/div[1]/div/div[2]/div/div/div[3]/div/a")
	private WebElement registerHereTextField;
	
	
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public LoggedInHomePage give_information_to_login() throws InterruptedException {
		usernameField.sendKeys("kn@gmail.com");
		passwordField.sendKeys("12345");
		Thread.sleep(4000);
		loginBtn.click();
		return new LoggedInHomePage(driver);
	}
	
	public String get_alert_text() {
		String alert_text = driver.switchTo().alert().getText();
		return alert_text;
	}
	
	public String get_registerHere_text() {
		String registerHereText = registerHereTextField.getText();
		return registerHereText;
	}
	
	
}
