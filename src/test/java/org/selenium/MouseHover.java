package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/hovers");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@id='examples-dropdown']"));
		
		a.moveToElement(element).perform();

		WebElement element1 = driver.findElement(By.xpath("//a[text()='APIs']"));
		
		a.moveToElement(element1).click().perform();
		
	}
}

