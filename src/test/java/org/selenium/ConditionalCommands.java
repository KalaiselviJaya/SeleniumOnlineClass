package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");  

		System.out.println(drive.findElement(By.xpath("//input [@name='email']")).isDisplayed());
		System.out.println(drive.findElement(By.xpath("//input [@name='email']")).isEnabled());
	}
}
