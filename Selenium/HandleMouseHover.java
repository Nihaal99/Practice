package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMouseHover {
	WebDriver driver = null;

	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\Dropdown Menu\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * Apply implicit wait If implicit wait is not applied then this programme will
		 * fail and give exception element not interactable This is because trouserLink
		 * takes time to load or appear after that it clicks on link but selenium
		 * doesn't wait for the script to load and execute other scripts Implicit wait
		 * will wait to execute all scripts in programme thus test passes
		 */

		// Implicit wait
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	//
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}

	@Test
	public void handleMouseHover() throws InterruptedException {
		driver.get("https://www.americangolf.eu/");
		WebElement clothLink = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(clothLink).build().perform();
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//*[@id='CLOTHFOOTW_1']/ul/li[3]/ul/li[1]/a/span"))));

		WebElement trouserLink = driver.findElement(By.xpath("//*[@id='CLOTHFOOTW_1']/ul/li[3]/ul/li[1]/a/span"));
		trouserLink.click();
		Assert.assertEquals("Golf Trousers · American Golf", driver.getTitle());

	}

}
