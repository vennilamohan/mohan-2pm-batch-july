package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	private void browserLaunch() {
		
		System.out.println("BeforeClass");

		
}
	

	@BeforeMethod
	private void before() {
		System.out.println("Before");
	}

	@AfterMethod
	private void After() {
		System.out.println("After");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");
	}

	
	@Test
	private void test() {
		System.out.println("test");

	}
	
}