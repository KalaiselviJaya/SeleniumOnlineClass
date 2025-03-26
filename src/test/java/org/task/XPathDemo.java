package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	
public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://practicetestautomation.com/practice-test-login/");  
		
		WebElement element = drive.findElement(By.xpath("//input [@type='text']"));
		element.sendKeys("student");
		WebElement element1 = drive.findElement(By.xpath("//input [@type='password']"));
		element1.sendKeys("Password123");
		WebElement element2 = drive.findElement(By.xpath("//button [@id='submit']"));
		element2.click();
		WebElement element3 = drive.findElement(By.xpath("//a [text()='Log out']"));
		element3.click();
		
	}	
}
