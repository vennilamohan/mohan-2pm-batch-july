package org.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {
	
	@Parameters({"username","password"})
	@Test
	private void testB1(String name,String pass) {
		System.out.println("TestB1");
		System.out.println(name);
		System.out.println(pass);
	}
	
	
	@Parameters({"password","password"})
	@Test
	private void testB2(String pass,String Pass) {
		System.out.println("TestB2");
		System.out.println(pass);
		System.out.println(pass);

	}

	@Test
	private void testB3() {
		System.out.println("TestB3");
	}

}
