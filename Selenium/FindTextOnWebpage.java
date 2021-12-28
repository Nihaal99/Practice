package com.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindTextOnWebpage {
	@Test
	public void findTextOnWebpage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
		
		//Applying Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String loginHeading=driver.findElement(By.xpath("//div[@class='_9axz']")).getText();
		System.out.println("The login heading is:"+loginHeading);//to print the login heading obtained by webdriver.
		Assert.assertEquals(loginHeading,"Log in to Facebook");
		
		//To get the placeholder text
	    //This test failed.Doubt in it
		String placeholderText=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder aria-label");
		System.out.println(placeholderText);
		Assert.assertEquals(placeholderText,"Email address or phone number");
		driver.quit();
		
		
	}

}
