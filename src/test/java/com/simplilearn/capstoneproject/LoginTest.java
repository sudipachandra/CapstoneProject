package com.simplilearn.capstoneproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplilearn.capstoneproject.pages.LoggedInHomePage;
import com.simplilearn.capstoneproject.pages.LoggedOutHomePage;
import com.simplilearn.capstoneproject.pages.LoginPage;

public class LoginTest extends Base{

	@Test
	public void testLogin() throws InterruptedException {
		
		LoggedOutHomePage loggedOutHomePage = new LoggedOutHomePage(driver);
		LoginPage loginPage = loggedOutHomePage.clickOnLogin();
		loginPage.give_information_to_login();
		LoggedInHomePage loggedInHomePage = new LoggedInHomePage(driver);
//		String actualName = loggedInHomePage.userName;
		
		String actualName = loggedInHomePage.get_username();
		AssertJUnit.assertEquals(actualName,"Kavita Nigam");
		System.out.println("login succesfull");
		
		loggedInHomePage.click_logout();
		
//		String alertMsg = loginPage.get_alert_text();
//		System.out.println("the alert message is :" + alertMsg);
		
		String loginText = loginPage.get_registerHere_text();
		AssertJUnit.assertEquals(loginText,"Register Here");
		System.out.println("logout succesfull");
		
	}
}
