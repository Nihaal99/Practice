package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class VerifyWebElementPresence {
	WebDriver driver=null;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Dropdown Menu\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
	}
//	
	@AfterMethod
	public void driverQuit() {
	driver.quit();
	}
	public void verifyElementDisplay() {
		driver.findElement(By.linkText("Toggle")).click();
		//To switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement toggleHeading=driver.findElement(By.xpath("//*[@id=\"effect\"]/h3"));
		
		Assert.assertTrue(toggleHeading.isDisplayed());
		
	}

}
