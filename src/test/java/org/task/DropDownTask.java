package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask {

public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://letcode.in/dropdowns"); 
		
		WebElement fruits = drive.findElement(By.xpath("//select[@id='fruits']"));
		Select s= new Select(fruits);
		s.selectByVisibleText("Apple");
		
		WebElement superheros = drive.findElement(By.xpath("//select[@id='superheros']"));
		Select s3= new Select(superheros);
		s3.selectByIndex(0);
		s3.selectByVisibleText("Aquaman");

		 if (s3.isMultiple()) {
	            System.out.println("It is Multiple selections.");
	        } else {
	            System.out.println("It is Single selection.");
	        }
		
		WebElement lang = drive.findElement(By.xpath("//select[@id='lang']"));
		Select s1= new Select(lang);
		s1.selectByIndex(4);
		List<WebElement> options = s1.getOptions();
		for(WebElement e: options) {
			System.out.println(e.getText());
		}
		
		WebElement country = drive.findElement(By.xpath("//select[@id='country']"));
		Select s2= new Select(country);
		s2.selectByValue("India");
		List<WebElement> options1 = s2.getAllSelectedOptions();
		for(WebElement a: options1) {
			System.out.println(a.getText());
		}
	}
}
