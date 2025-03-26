package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");  
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.xpath("//input [@type='text']"));

	WebElement pass = driver.findElement(By.xpath("//input [@type='password']"));

	WebElement submit = driver.findElement(By.xpath("//button [@id='submit']"));

	JavascriptExecutor jse=(JavascriptExecutor)driver;
		
	jse.executeScript("arguments[0].value='student';arguments[1].value='Password123';arguments[2].click();", user,pass,submit);
	
	}
}
