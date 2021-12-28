package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffSignInTest {
	@Test
	public void testRediffSignIn() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open the Rediff.com
		driver.get("https://www.rediff.com/");
		
		//Verify PageTitle
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle,"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		//Click Sign-In Button
		//The values inserted in locators like Id,name,linkText,CSS etc. must be taken from the inspect and view page source options in browser itself.
		WebElement signInLink=driver.findElement(By.linkText("Sign in"));
		signInLink.click();
		
		//Verify Sign-In page title
		Assert.assertEquals(driver.getTitle(),"Rediffmail");
		
		//Insert username and password
		WebElement username=driver.findElement(By.id("login1"));
		username.sendKeys("nihaal@rediff.com");
		//To increase timestep of selenium in browser.
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("test@123");
		//To increase timestep of selenium in browser.
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//After Entering login and password details automatically using selenium next step is:
		//Click sign in button
		WebElement signin=driver.findElement(By.name("proceed"));
		signin.click();
		
		//To end all operations.
		driver.quit();
		
		
	}

}
