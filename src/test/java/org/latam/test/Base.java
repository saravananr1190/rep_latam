package org.latam.test;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	
	
	public static WebDriver d;
	public static TakesScreenshot ts;
	File f = new File("E:\\Selenium\\LatamCanada\\Screenshots");
	public static void launch(String name) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Task1\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get(name);
	}
	public static void quit() {
		d.quit();
	}
	public static WebElement findById(String name){
		return d.findElement(By.id(name));
	}
	public static WebElement findByname(String name){
		return d.findElement(By.name(name));
	}
	public static WebElement findByClassname(String name){
		return d.findElement(By.className(name));
	}
	public static WebElement findByxpath(String name){
		return d.findElement(By.xpath(name));
	}
	public static void type(WebElement e, String name) {
		e.sendKeys(name);	
	}
	
	public static void screenshot(String url) throws Exception {
		File f = new File(url);
		ts = (TakesScreenshot) d;
		File s = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, f);
	}
	
	
	public static  String doubleToString(double d) {
		long l = (long) d;
		String s=String.valueOf(l);
		return s;
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void selectByIndex(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
	}
	public static void selectByValue(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByValue(i);
	}
	public static void selectByVisibleText(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByVisibleText(i);
	}
	
	public static void scrollDown(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	
	public static void scrollUp(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}

}




