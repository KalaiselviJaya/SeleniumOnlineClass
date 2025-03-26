package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeSlider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/horizontal-slider");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='range']"));
		Point location = element.getLocation();
		System.out.println(location);
		a.dragAndDropBy(element, 150, 300).perform();
	
	}

}
