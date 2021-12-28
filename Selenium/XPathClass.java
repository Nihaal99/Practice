package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XPathClass {
	@Test
	public void absoluteXpath() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe" );
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.rediff.com/");
	    driver.findElement(By.linkText("Sign in")).click();
	    //Xpath is used when other locators are unable to find element.Used to find image etc.
	    driver.findElement(By.xpath("/html/body/div/div/div/div/a/href")).click();
	    //here the Xpath location in the site has changed so test will not execute.
	    Assert.assertEquals("driver.getTitle()","Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	    driver.quit();
	
	}
	
	@Test
	public void relativeXpath() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe" );
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.rediff.com/");
	    driver.findElement(By.linkText("Sign in")).click();
	    //Relative Xpath is used when other locators are unable to find element.In comparison to abs.Xpath we can start giving path at in between any position.
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("nihalrane@gmail.com");
	    driver.quit();
	   }
	//We can create Xpaths with browsers without finding them manually.
	

}
