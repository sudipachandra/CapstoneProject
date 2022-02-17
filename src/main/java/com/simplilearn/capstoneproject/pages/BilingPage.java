package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BilingPage {

	@FindBy(xpath="//*[@id=\"addressLineOne\"]")
	private WebElement addressOne;
	@FindBy(xpath="//*[@id=\"addressLineTwo\"]")
	private WebElement addressTwo;
	@FindBy(xpath="//*[@id=\"city\"]")
	private WebElement city;
	@FindBy(xpath="//*[@id=\"postalCode\"]")
	private WebElement postalCode;
	@FindBy(xpath="//*[@id=\"state\"]")
	private WebElement state;
	@FindBy(xpath="//*[@id=\"country\"]")
	private WebElement country;
	@FindBy(xpath="//*[@id=\"billingForm\"]/div[7]/div/button[2]")
    private WebElement nextConfirmBtn;
	
	WebDriver driver = null;
	public BilingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void give_information_to_biling() throws InterruptedException {
		Thread.sleep(4000);
		addressOne.sendKeys("hsr");
		addressTwo.sendKeys("hsr");
		city.sendKeys("bangalore");
		postalCode.sendKeys("560102");
		state.sendKeys("karnataka");
        country.sendKeys("india");
        Thread.sleep(4000);
        nextConfirmBtn.click();
		
	}
	}
	
	

