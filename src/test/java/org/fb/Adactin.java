package org.fb;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Adactin extends BaseClass{
	
	
		@BeforeClass
	private void beforeClass() {
			browserLaunch();
			urlLaunch("http://adactinhotelapp.com/");
			
		}
		
		//@AfterClass
		//private void afterClass() {
		//	driver.quit();

	//	}
		
		@BeforeMethod
		private void beforeMethod() {
			Date d = new Date();
			System.out.println(d);

		}
	@AfterMethod
	private void aftermethod() {
		Date d1 =new Date();
		System.out.println(d1);

	}

	@Test
	private void test() {
		WebElement txtusername = findElement("id","username");
	fillTextBox(txtusername,"vennilamohan");
	
	WebElement txtpassword = findElement("id","password");
	fillTextBox(txtpassword,"Mohan@123");
	
	WebElement btnlogin = findElement("id","login");
	btnclick(btnlogin);
	
	
	//WebElement loc = driver.findElement(By.id("location"));
	WebElement loc = findElement("id", "location");
	selectByIndex(loc,2);
	
	//WebElement hotel = driver.findElement(By.id("hotels"));
	WebElement hotel = findElement("id", "hotels");
	selectByIndex(hotel,2);
	
	//WebElement roomtype = driver.findElement(By.id("room_type"));
	WebElement  roomtype = findElement("id", "room_type");
	selectByIndex(roomtype,1);
	
	//WebElement roomcount = driver.findElement(By.id("roomcount"));
	WebElement roomcount = findElement("id", "room_nos");
	selectByIndex( roomcount,2);
	
	WebElement datein = driver.findElement(By.id("datepick_in"));
	//datein.clear();
	clear(datein);
	fillTextBox(datein,"15/07/2021");
	
	WebElement dateout = driver.findElement(By.id("datepick_out"));
	//dateout.clear();
	clear(dateout);
	fillTextBox(dateout,"18/07/2021");
	
	//WebElement adultcount = driver.findElement(By.id("adult_room"));
	WebElement adultcount = findElement("id", "adult_room");
	selectByIndex(adultcount,2);
	
	//WebElement childcount = driver.findElement(By.id("child_room"));
	WebElement childcount = findElement("id", "child_room");
	selectByIndex(childcount,2);
	
	//WebElement btnsearch = driver.findElement(By.xpath("//input[@type='submit']"));
	WebElement btnsearch = findElement("id", "Submit");
	btnclick(btnsearch);
	//btnsearch.click();
	
//	WebElement clkbtnradio = driver.findElement(By.id("radiobutton_0"));
	WebElement clkbtnradio = findElement("id", "radiobutton_0");
	btnclick(clkbtnradio);
	//clkbtnradio.click();
	
//	WebElement clkcon = driver.findElement(By.id("continue"));
	WebElement clkcon = findElement("id", "continue");
	btnclick(clkcon);
//	clkcon.click();
	
	//WebElement firstname = driver.findElement(By.id("first_name"));
	WebElement firstname = findElement("id", "first_name");
	fillTextBox(firstname,"mohan");
	
	//WebElement lastname = driver.findElement(By.id("last_name"));
	WebElement lastname = findElement("id", "last_name");
	fillTextBox(lastname,"raj");
	
	//WebElement address = driver.findElement(By.id("address"));
	WebElement address = findElement("id", "address");
	fillTextBox(address,"chennai");
	
	//WebElement ccno = driver.findElement(By.id("cc_num"));
	WebElement ccno = findElement("id", "cc_num");
	fillTextBox(ccno,"8765443246688654");
		
//	WebElement cctype = driver.findElement(By.id("cc_type"));
	WebElement cctype = findElement("id", "cc_type");
	selectByIndex(cctype,3);
	
	//WebElement exmonth = driver.findElement(By.id("cc_exp_month"));
	WebElement exmonth = findElement("id", "cc_exp_month");
	selectByIndex(exmonth,4);
	
	//WebElement exyear = driver.findElement(By.id("cc_exp_year"));
	WebElement exyear = findElement("id","cc_exp_year");
	selectByIndex(exyear,12);
	
	
	WebElement ccvno = findElement("xpath", "(//input[@type='text'])[14]");
//	WebElement ccvno = findElement("xpath", "(//input[@type='text'])[14]");
	//WebElement ccvno = findElement("xpath","text");
	fillTextBox(ccvno,"215");
	
	//WebElement btnbook = driver.findElement(By.id("book_now"));
	WebElement btnbook = findElement("id","book_now");
	btnclick(btnbook);
	
	//WebElement IdNo = driver.findElement(By.id("order_no"));
	//String ORID = IdNo.getAttribute("value");	
	//System.out.println("ORDER ID NO IS  " +ORID);
	
	WebElement IDNO = findElement("id", "order_no");
	String id = getAttribute(IDNO);
	System.out.println(id);
	
	
	WebElement btnilitery = findElement("id","my_itinerary");
	btnclick(btnilitery);
	
	
// WebElement selectlast = findElement("name","ids[]");
	//	btnclick(selectlast);	
	
	//(//td[@bgcolor='#FFFFFF'])[197]
			
		//	WebElement selectlast = findElement("xpath", "(//td[@bgcolor='#FFFFFF'])[197])");
	//btnclick(selectlast);
	
	
	WebElement selectlast = findElement("xpath", "//input[@value='435411']");
	btnclick(selectlast);
	
	WebElement cancellast = findElement("name","cancelall");
	btnclick(cancellast);
	
	confirmAlert();
	

	
}
	
	
	
	
	
	
		
	
	
}
