package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");  
		
		WebElement element3 = drive.findElement(By.id("email"));
		element3.sendKeys("vickythamil@gmail.com");
		WebElement element2 = drive.findElement(By.id("pass"));
		element2.sendKeys("Msdhoni@7");
		WebElement element = drive.findElement(By.name("login"));
		element.click();
		drive.findElement(By.linkText("Forgotten password?")).click();
		drive.findElement(By.partialLinkText("Create")).click();
		List<WebElement> elements = drive.findElements(By.className("_6ltg"));
		System.out.println(elements.size());
		List<WebElement> element4 = drive.findElements(By.tagName("a"));
		System.out.println(element4.size());
	}
	
}

