package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;
import com.qa.utils.TestUtils;


public class SignInPage extends TestBase{

	

	TestUtils utils;
	Actions mouse;
	//h1[contains(text(),"Sign in")]
	

	// constructor created based on base class to initialize this page objects on
	// this class
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='ap_email']")
	WebElement usertxtfield;
	
	@FindBy(xpath = "//div[@class='a-section']/span")
	WebElement continueBtn;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passTextfeild;
	
	@FindBy(xpath = "//span[@id='auth-signin-button']")
	WebElement signinBtn;
	
	
	@FindBy(xpath = "//input[@name='rememberMe']")
	WebElement rememberMeCheck;
	

	public SignInPage signin(String un){
		usertxtfield.clear();
		usertxtfield.sendKeys(un);
		continueBtn.click();
		return new SignInPage();
	}
	
	public SignInPage pass(String pwd){
		passTextfeild.clear();
		passTextfeild.sendKeys(pwd);
		rememberMeCheck.click();
		signinBtn.click();
		return new SignInPage();
	}
}
