package com.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HandleWebTable {
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
	
	public void manageWebTable() {
		driver.get("https://money.rediff.com/indices");
		driver.findElement(By.xpath("//*[@id='showMoreLess']"));
	}

}
