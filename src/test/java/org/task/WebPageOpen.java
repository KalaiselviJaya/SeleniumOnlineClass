package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageOpen {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://reshmi-02.github.io/insta/");  
		
		WebElement element3 = drive.findElement(By.id("username"));
		element3.sendKeys("Kalaiselvicky");
		WebElement element2 = drive.findElement(By.id("email"));
		element2.sendKeys("kalaics2000jp@gmail.com");
		WebElement element = drive.findElement(By.id("password"));
		element.sendKeys("Kalai@123");
		WebElement element4 = drive.findElement(By.id("register"));
		element4.click();
		WebElement element7 = drive.findElement(By.id("userna"));
		element7.sendKeys("Kalaiselvicky");
		WebElement element6 = drive.findElement(By.id("passwrd"));
		element6.sendKeys("Kalai@123");
		WebElement element5 = drive.findElement(By.id("login"));
		element5.click();
	}

}
