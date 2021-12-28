package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OptionsClassSelenium {
	
	
	public void acceptCertificate() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
	    ChromeOptions co=new ChromeOptions();
	    co.setAcceptInsecureCerts(true);//This method allows us to open not secure websites which chrome asks for SHA certificates to run.
	    
	    WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://cacert.org");
	}
	
	
	public void OpenHeadLess() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setHeadless(true);//This method will open the browser not in UI mode.i.e.we will not se any window opening by driver but test cases will get executed.
		
		WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://cacert.org");
		 
		}

	@Test
	public void setArguments() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-infobars");//This method whenever selenium runs will not show message browser opened by selenium type messages.
	    co.addArguments("--disable-notifications");//This method will allow not to show pop up messages on opening the websites.
	    
	    WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://weather.com/en-IN/");
	    
	}
}
