package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstGitProject {
public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");
		WebElement element3 = drive.findElement(By.id("email"));
		element3.sendKeys("vickythamil@gmail.com");
		WebElement element2 = drive.findElement(By.id("pass"));
		element2.sendKeys("Msdhoni@7");
		WebElement element = drive.findElement(By.name("login"));
		element.click();
}
}
