package org.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	
	@Test(dataProvider="login")
	private void testA1(String user,String pass) {
		System.out.println("testA1");
		System.out.println(user);
		System.out.println(pass);
		
	}
	
    @Test
		private void testA2() {
			
        System.out.println("testA2");

		}
    
    @Test
    private void testA3() {
		
       System.out.println("testA3");
       
	}
    
    @DataProvider(name="login")
private Object [][] data() {
	Object[][] d =new Object[][] 
			{
		{"mohan","1234"},
		{"raj","3456"},
		{"kumar","5678"},
		{"pream","9876"}
			};
		return d;	
			
			}


	
	

}
