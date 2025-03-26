package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTask {


public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame"); 
		
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Kalai");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Vicky");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
	    driver.switchTo().frame(frame);
		
		WebElement web=driver.findElement(By.xpath("//input[@name='email']"));
		web.sendKeys("kalaics2000jp@gmail.com");
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}
		
}
