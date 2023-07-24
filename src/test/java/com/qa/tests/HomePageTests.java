package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;

public class HomePageTests extends TestBase {

	HomePage homePage;
	SignInPage signInPage;
	public HomePageTests() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage();
		signInPage = new SignInPage();
	}
	
	
	@Test(priority=1)
	public void validate_HomePageTitle() {
		String Actual_title = driver.getTitle();
		System.out.println(Actual_title);
		String Expected_title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(Actual_title, Expected_title);
	}
	
	@Test(priority=2)
	public void validate_HomePageUrl() {
		String Actual_url = driver.getCurrentUrl();
		System.out.println(Actual_url);
		String Expected_url = "https://www.amazon.in/";
		Assert.assertEquals(Actual_url, Expected_url);
	}		
	
	@Test(priority=3)
	public void validate_ToNavigateIntoSignPage_title() {
		homePage.clickSignInButton();
		String Actual_title= driver.getTitle();
		String Expected_title="Amazon Sign In";
		Assert.assertEquals(Actual_title, Expected_title);
		
	}
	
	@Test()
	public void trye() {
	}
	
	@Test(priority=4, dependsOnMethods ="validate_ToNavigateIntoSignPage_title()" )
	public void Validate_signIn() {
		//SignInPage
		
		
		
		
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
