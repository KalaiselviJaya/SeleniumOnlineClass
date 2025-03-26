package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScrollDown {


	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/java/java_strings.asp");  
	driver.manage().window().maximize();
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	//jse.executeScript("window.scrollBy(0,3000)");
	
	WebElement data = driver.findElement(By.xpath("//h2[text()='String Length']"));
	jse.executeScript("arguments[0].scrollIntoView(true)",data);
	
	Thread.sleep(2000);
	
	}
}
