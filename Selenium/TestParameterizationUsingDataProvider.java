package com.selenium.webelement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationUsingDataProvider {
	//The input values to actual and expected parameter will be provided by data provider.
	//calling data provider with class
	@Test(dataProvider= "getData")
	public void testAddition(int actual,int expected) {
		int actualValue=actual+20;
		Assert.assertEquals(actualValue, expected);
	}
	//calling data provider by name
	@Test(dataProvider= "DoubleSet")
	public void testAddition1(int actual,int expected) {
		int actualValue=actual+20;
		Assert.assertEquals(actualValue, expected);
	}
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{100,120},
			{200,220},
			{250,270},
			{300,310},
			{400,420}
		};
	}
	@DataProvider(name="DoubleSet")
	public Object[][] getDataSet2(){
		return new Object[][] {
			{10,30},
			{20,40}
		};
	}


}
