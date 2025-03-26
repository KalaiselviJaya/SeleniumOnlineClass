package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTask {

public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://testautomationpractice.blogspot.com/"); 
		
		List<WebElement> list = drive.findElements(By.xpath("//input[contains(@id,'day')]"));
		
//------------------To get first two values---------------------------
		list.get(0).click();
		list.get(1).click();
	
//------------------To get last two values----------------------------		
		list.get(5).click();
		list.get(6).click();
	}
}
