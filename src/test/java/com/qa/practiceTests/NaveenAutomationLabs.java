package com.qa.practiceTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class NaveenAutomationLabs extends TestBase {
	
	public NaveenAutomationLabs() {
		super();
	}
	
	@BeforeMethod
	public void first() throws InterruptedException {
		initialization();
	}

	@Test
	public void ZooplaEx1() {
		driver.navigate().to("https://www.zoopla.co.uk");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement s_textfeild = driver.findElement(By.xpath("//div[@data-testid='autosuggest-search-input']//input"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role='combobox']")));
		s_textfeild.sendKeys("London");
		WebElement searchBtn = driver.findElement(By.xpath("//button[@data-testid='search-btn']"));
		searchBtn.click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
	}

}
