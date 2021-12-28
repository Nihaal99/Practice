package com.selenium.webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleDragAndDrop {
	WebDriver driver=null;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Dropdown Menu\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
//	
	@AfterMethod
	public void driverQuit() {
	driver.quit();
	}
	//@Test
	public void dragAble() throws InterruptedException {
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		
		driver.switchTo().frame(0);
		WebElement dragAble=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(dragAble,110, 120).build().perform();
		Thread.sleep(5000);
	}
	@Test
	public void testDragAndDrop() throws InterruptedException {
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions action=new Actions(driver);
		action.clickAndHold(source).moveToElement(target).release(target).build().perform();
		Thread.sleep(5000);
		
	}
}
