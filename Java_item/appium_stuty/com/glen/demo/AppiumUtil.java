package com.glen.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AppiumUtil {
	protected WebDriver driver;

	public AppiumUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void setTimeout(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public void clickMethod(By by) {
		driver.findElement(by).click();
	}

	public void sendKeysMethod(By by, String values) {
		driver.findElement(by).sendKeys(values);
	}
	public void assertTrueMethod(By by){
		
		Assert.assertTrue(driver.findElement(by).isDisplayed());
		
		}
}

		
	

