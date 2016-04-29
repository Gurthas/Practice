package com.glen.demo;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LoginKkyM {
	 private  AndroidDriver driver;
	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		// set up appium
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apps");
		File app = new File(appDir, "android_merchant_release_v1.2.2.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "192.168.56.101:5555");
		capabilities.setCapability("platformVersion", "4.4.4");
		// capabilities.setCapability("app", app.getAbsolutePath());//安装客户端
		capabilities.setCapability("appPackage", "com.kuaikuaiyu.merchant");
		capabilities.setCapability("appActivity", ".ui.activity.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test(groups = { "login" })
	public void shoplogin() {
		AppiumUtil op = new AppiumUtil(driver);
		op.setTimeout(4);
	    op.sendKeysMethod(By.id("com.kuaikuaiyu.merchant:id/et_mobile"), "13901111112");
	    op.sendKeysMethod(By.id("com.kuaikuaiyu.merchant:id/et_pwd"), "123456");
	    op.clickMethod(By.id("com.kuaikuaiyu.merchant:id/btn_login"));
	    op.assertTrueMethod(By.id("com.kuaikuaiyu.merchant:id/rb_order"));
			
	           
	}
	@AfterMethod(alwaysRun = true)
	public void tearDown(){
		driver.quit();
	}
}
