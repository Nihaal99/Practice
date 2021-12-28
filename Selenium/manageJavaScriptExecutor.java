package com.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class manageJavaScriptExecutor {
	WebDriver driver=null;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Dropdown Menu\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
//	
	@AfterMethod
	public void driverQuit() {
	driver.quit();
	}
	@Test
	
	public void testJavaScriptExecutor() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.rediff.com/'");
		
		
		Thread.sleep(5000);
	}

}
