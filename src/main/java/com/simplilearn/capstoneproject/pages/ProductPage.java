package com.simplilearn.capstoneproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	@FindBy(xpath="//*[@id=\"productListTable_info\"]")
	private WebElement productNoField;
	
	WebDriver driver = null;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);	
		}
	
	public String get_product_no() throws InterruptedException {
		Thread.sleep(4000);
		String productNo = productNoField.getText();
		return productNo;
	}
	
}
