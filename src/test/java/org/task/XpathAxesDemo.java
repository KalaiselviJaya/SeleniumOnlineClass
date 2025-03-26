package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://testautomationpractice.blogspot.com/");  
		
		drive.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[4]/td[5]")).getText();
		
		
		
	}	
}
