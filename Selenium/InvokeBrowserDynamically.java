package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeBrowserDynamically {
	WebDriver driver=null;
	//XML file parameter name browser will be mathched here with value provided in Parameters annotation.
	@Parameters("browser")
	@BeforeMethod
	public void OpenBrowser(String browser) {
		//Open the URL with Selenium
		//equalsIgnoreCase ignores the case sensitiveness.
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		
		}else {
			System.setProperty("webdriver.opera.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\geckodriver.exe");
			WebDriver driver=new OperaDriver();
		}
		
		//To maximize the browser
		driver.manage().window().maximize();
		}
	@Test
	public void verifyFaceBookHomePage() {
		String URL="https://www.facebook.com";
		driver.get(URL);
		//Verify homepage title
		String pageTitle=driver.getTitle();
		System.out.println("We get the Title as:"+pageTitle);
		Assert.assertEquals(pageTitle, "Facebook - लॉग इन किंवा साइन अप");
		driver.close();
		//For keeping browser window for a duration of time(in ms).
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
