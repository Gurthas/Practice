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

public class KkyMerchantLogout
{
	private  AndroidDriver  driver;
	 
    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir,"android_merchant_debug_v1.1.7.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","192.168.56.101:5555");
        capabilities.setCapability("platformVersion", "4.4.4");
        //capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage","com.kuaikuaiyu.merchant");
        capabilities.setCapability("appActivity",".ui.activity.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
 
   
 
    @Test(groups={"shoplogin"})
    public void shoplogin(){
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	WebElement el1 = driver.findElement(By.id("com.kuaikuaiyu.merchant:id/rb_shop"));
    	el1.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    	driver.swipe(350, 580, 350, 380, 300);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement el2 = driver.findElement(By.id("com.kuaikuaiyu.merchant:id/btn_logout"));
        el2.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement el3 = driver.findElement(By.id("com.kuaikuaiyu.merchant:id/btn_confirm_confirmdialog"));
        el3.click();
        Assert.assertTrue( driver.findElement(By.id("com.kuaikuaiyu.merchant:id/btn_signup")).isDisplayed());
    }
    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
