package com.simplilearn.capstoneproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.simplilearn.capstoneproject.pages.LoggedOutHomePage;
import com.simplilearn.capstoneproject.pages.ProductPage;

public class ProductDetailsTest extends Base {

	@Test
	public void testProductDetails() throws InterruptedException {
		LoggedOutHomePage loggedOutHomePage = new LoggedOutHomePage(driver);
		loggedOutHomePage.clickOnViewProduct();
		ProductPage productPage = new ProductPage(driver);
		String productNoText = productPage.get_product_no();
		System.out.println(productNoText);
		AssertJUnit.assertTrue(productNoText.contains("6"));
	}
}
