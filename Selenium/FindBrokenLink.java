//GetLinkStatus and FindBrokenLink are interrelated.
//error in running test.
package com.selenium.webelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLink {
	@Test
	public void findBrokenLink() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\FirstSeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edition.cnn.com/");
		//Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to find all links present in CNN.
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are:"+links.size());
		for(WebElement link:links) {
			System.out.println(link.getText());
			String URL=link.getAttribute("href");
			GetLinkStatus.verifyLink("URL");
		}
		System.out.println("Total number of broken links are:");
		GetLinkStatus.getinvalidLinkCount();
		driver.close();
	}

}
