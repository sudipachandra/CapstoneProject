package com.simplilearn.capstoneproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplilearn.capstoneproject.pages.BilingPage;
import com.simplilearn.capstoneproject.pages.ConfirmSignUpPage;
import com.simplilearn.capstoneproject.pages.LoggedOutHomePage;
import com.simplilearn.capstoneproject.pages.SignUpPage;
import com.simplilearn.capstoneproject.pages.WelcomePage;

public class SignUpTest extends Base{

	@Test
	public void testSignUp() throws InterruptedException {
		LoggedOutHomePage loggedOutHomePage = new LoggedOutHomePage(driver);
		loggedOutHomePage.clickOnSignUp();
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.give_information_to_signup();
		BilingPage bilingPage = new BilingPage(driver);
		bilingPage.give_information_to_biling();
		ConfirmSignUpPage confirmSignUpPage = new ConfirmSignUpPage(driver);
		confirmSignUpPage.click_confirm();
		WelcomePage welcomePage = new WelcomePage(driver);
		String welcomeText = welcomePage.get_text_from_welcome_btn();
		AssertJUnit.assertEquals(welcomeText,"Welcome!");
		
	}
}
