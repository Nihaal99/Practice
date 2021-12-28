package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public  class FirstSeleniumTest{
	@Test
	public void verifyFacebookHomePage() {
		String URL="https://www.facebook.com";
		
		//open the url with Windows
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		//In order to execute chrome driver we need to set driver property
		
		//Open the URL with Chrome
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
	    driver.manage().window().maximize();
	    
	    //will execute the URL
		driver.get(URL); 
		
		
		//Verify homepage title
        String pageTitle=driver.getTitle();
		System.out.println("the pagetitle given by driver is"+pageTitle);
		//Assert method will compare the pagetitle obtained by cromer driver automatic test with the manual page title written as "Facebook - लॉग इन किंवा साइन अप"
		Assert.assertEquals(pageTitle,"Facebook - लॉग इन किंवा साइन अप");
		//to close the driver
		driver.close();
		
		
		
	}
}



