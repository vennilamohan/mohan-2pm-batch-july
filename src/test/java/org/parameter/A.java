package org.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	
	
	@Test
	private void testA1() {
		System.out.println("TestA1");

	}
	@Parameters({"username"})
	@Test
	private void testA2(String name) {
		System.out.println("TestA2");
		System.out.println(name);
		

	}
@Parameters({"password"})
	@Test
	private void testA3(String pass) {
		System.out.println("TestA3");
System.out.println(pass);
	}
}
