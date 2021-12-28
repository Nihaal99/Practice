package com.selenium.webelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HandleAutoSuggest {
	WebDriver driver = null;

	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\Dropdown Menu\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}

	@Test
	public void handleAutoSuggest() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("Selenium");
		// To wait for autosuggestions to pop up explicit wait is applied.
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(
				ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[@role='listbox']/li"))));

		// To save the autosuggestions in list
		List<WebElement> autoSuggests = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		System.out.println(autoSuggests.get(2).getText());
	}

}
