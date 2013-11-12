package com.bit.parallel.test;


import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
public class TestBase 
{
 
    protected ThreadLocal<RemoteWebDriver> threadDriver = null;
 
    @BeforeMethod
    public void setUp() throws MalformedURLException 
    {
        threadDriver = new ThreadLocal<RemoteWebDriver>();
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome"); 
        threadDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability));
    }
 
    public WebDriver getDriver() 
    {
        return threadDriver.get();
    }
 
    @AfterMethod
    public void closeBrowser() 
    {
        getDriver().quit();
 
    }
}