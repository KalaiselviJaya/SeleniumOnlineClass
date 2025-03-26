package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/double-click");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='double-click-btn']"));
		a.doubleClick(element).perform();
		
	}
}
