package com.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Handleiframes {
	//Webdriver assigned in class means it is applicable to all methods inside class.
	WebDriver driver=null;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	@Test
	public void getIframe() {
		
		
	}
	

}
