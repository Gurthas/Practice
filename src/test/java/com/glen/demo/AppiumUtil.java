package com.glen.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppiumUtil {
	protected WebDriver driver;

	public AppiumUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void setTimeout(String timeout) {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(timeout), TimeUnit.SECONDS);
	}

}
