package org.groupings;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

public class A {

	@Test(groups = {"smoke","regression"})
	private void testA1() {
		System.out.println("TestA1");
	}

	@Test(groups= { "smoke","regression"})
	private void testA2() {
		System.out.println("TestA2");
	}

	@Test(groups= {"sanity","regression"})
	private void testA3() {
		System.out.println("TestA3");
	}

	@Test(groups= "regression")
	private void testA4() {
		System.out.println("TestA4");
	}

	@Test(groups= {"smoke","regression"})
	private void testA5() {
		System.out.println("TestA5");
	}

	@Test(groups= "regression")
	private void testA6() {
		System.out.println("TestA6");
	}

	@Test(groups= {"smoke","regression"})
	private void testA7() {
		System.out.println("TestA7");
	}

	@Test(groups= {"sanity","regression"})
	private void testA8() {
		System.out.println("TestA8");

	}
}