package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementsPresentOnWebsiteOrNot {
	@Test
	public void  webElementsPresentOnWebsiteOrNot() {
		String URL="https://www.tripadvisor.in/";
		
		//open the url with Windows
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		//In order to execute chrome driver we need to set driver property
		
		//Open the URL with Chrome
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
	    driver.manage().window().maximize();
	    
	    //will execute the URL
		driver.get(URL);
		//To check webelements present or not
		if(driver.findElements(By.className("._3qLQ-U8m")).size()!=0) {
			System.out.println("Element present");
		}else {
			System.out.println("Element not present");
		}
		driver.quit();
		

}
}
