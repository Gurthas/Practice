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

public class KkyLogin
{
	private  AndroidDriver  driver;
	 
    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir,"android_user_kky-debug_v1.6.0_1035.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","192.168.56.101:5555");
        capabilities.setCapability("platformVersion", "4.4.4");
        //capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage","com.kuaikuaiyu.user");
        capabilities.setCapability("appActivity",".ui.activity.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
 
   
 
    @Test(groups={"login"})
    public void login(){
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement el1 = driver.findElement(By.id("com.kuaikuaiyu.user:id/tv_mine"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        el1.click();
        WebElement el2 = driver.findElement(By.id("com.kuaikuaiyu.user:id/iv_avatar"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        el2.click();
        WebElement el3 = driver.findElement(By.name("密码登录"));
        el3.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("15801551113");
        textFieldsList.get(1).sendKeys("123456");
        driver.findElementByName("点击登录").click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertTrue( driver.findElement(By.id("com.kuaikuaiyu.user:id/iv_home")).isDisplayed());
    }
    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
