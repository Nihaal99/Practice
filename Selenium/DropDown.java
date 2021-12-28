package com.selenium.webelement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DropDown {
	WebDriver driver=null;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Dropdown Menu\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
//	
	@AfterMethod
	public void driverQuit() {
	driver.quit();
	}
	@Test
	public void test() {
		//Applying Implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //Entering values and click
		driver.findElement(By.xpath("//a/u[text()='Create a new account']")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Kamal");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("kamal1234");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		
		//Select autoselected mail option coding not done,below line is not working.
		driver.findElement(By.xpath("//*[@id=\"recommend_text\"]/table/tbody/tr[1]/td[1]")).click();
		////*[@id="recommend_text"]/table/tbody/tr[1]/td[2]
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kamal@1234");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("Kamal@1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		WebElement dayDropDown=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	    Select selectday=new Select(dayDropDown);
	    selectday.selectByVisibleText("20");
	    
    WebElement monthDropDown=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
    Select selectmonth=new Select(monthDropDown);
    selectmonth.selectByIndex(6);
    
    WebElement yearDropDown=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
    Select selectyear=new Select(yearDropDown);
    selectyear.selectByVisibleText("2000");
		
    
    
    WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select select=new Select(country);
	List<WebElement> countryValues=select.getOptions();
	for(WebElement cntry:countryValues) {
		System.out.println(cntry.getText());
		}
	System.out.println("The total count of countries is:"+countryValues.size());
	select.selectByVisibleText("India");
	
	System.out.println(select.getFirstSelectedOption().getText());
	Assert.assertEquals(select.getFirstSelectedOption().getText(),"India");
	}

}
