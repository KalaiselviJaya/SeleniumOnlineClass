package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationsCommand {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/"); 
		
		System.out.println(drive.getTitle());
		System.out.println(drive.getCurrentUrl());
		System.out.println(drive.getPageSource());
		WebElement web = drive.findElement(By.id("email"));
		
		System.out.println(web.getLocation());
		System.out.println(web.getCssValue("background-color"));
		System.out.println(web.getSize());
		System.out.println(web.getAttribute("id"));
		WebElement element3 = drive.findElement(By.xpath("//h2[@class='_8eso']"));
		element3.getText();
		WebElement element4 =drive.findElement(By.xpath("//h2[@class='_8eso']"));
		element4.getTagName();
		web.sendKeys("kalaics2000jp@gmail.com");
		web.clear();
		web.sendKeys("vickythamil@gmail.com");
		WebElement element2 = drive.findElement(By.id("pass"));
		element2.sendKeys("Msdhoni@7");
		WebElement element = drive.findElement(By.name("login"));
		element.click();
	}
}
