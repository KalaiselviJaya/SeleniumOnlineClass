package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement element1 = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		a.dragAndDrop(element, element1).perform();
		
	}
}
