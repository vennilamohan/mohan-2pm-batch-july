package org.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DESKTOP\\eclipse-workspace\\TestNGProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebElement findElement(String LocatorType, String value) {
		WebElement element = null;
		if (LocatorType.equals("id")) {
			element = driver.findElement(By.id(value));
		} else if (LocatorType.equals("name")) {
			element = driver.findElement(By.name(value));
		} else if (LocatorType.equals("xpath")) {
			element = driver.findElement(By.xpath(value));

		}
		return element;
	}

	public static void fillTextBox(WebElement element, String value) {
		
		element.clear();
		element.sendKeys(value);
		

	}
	// public static void fillTextBox(WebElement element,int value) {
	// element.sendKeys(value);
	// }

	public static void btnclick(WebElement e) {
		e.click();
	}

	public static void browserquit() {
		driver.quit();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void getText(WebElement Element) {
		Element.getText();
	}

	public static String getAttribute(WebElement e) {
		String sat = e.getAttribute("value");
		return sat;
	}

	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void drogAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des);

	}

	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
		

	}
	
	public static void cancelConfirmAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
		

	}

	public static void promptAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
		a.getText();
		a.dismiss();

	}

	public static void jsSendkeys(WebElement e, String input) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value',' " + input + "')", e);

	}

	public static void jsClick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);

	}

	public static void takesScreenshot(String image) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DESKTOP\\eclipse-workspace\\ mavenintro\\snaps" + image + ".png");
		FileUtils.copyFile(src, des);
	}
	

	

}
