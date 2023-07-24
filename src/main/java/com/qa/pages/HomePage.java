package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
import com.qa.utils.TestUtils;

public class HomePage extends TestBase {

	TestUtils utils;
	Actions mouse;

	// constructor created based on base class to initialize this page objects on
	// this class
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement signInBtn;
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement navUser;
	
	By newuser = By.xpath("//div[contains(text(),'New customer?')]");

	public SignInPage clickSignInButton() {
		utils = new TestUtils();
		Actions mouse = utils.actions();
		mouse.moveToElement(navUser).build().perform();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(newuser));
		mouse.moveToElement(signInBtn).click().build().perform();
		//signInBtn.click();
		return new SignInPage();
	}

}
