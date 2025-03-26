package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationTask {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://letcode.in/buttons");
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//button[@id='home']")).click();
		drive.navigate().back();
		WebElement web = drive.findElement(By.xpath("//button[@id='position']"));
		System.out.println(web.getLocation());
		WebElement element = drive.findElement(By.xpath("//button[@id='color']"));
		System.out.println(element.getCssValue("background-color"));
		WebElement element1 = drive.findElement(By.xpath("//button[@id='property']"));
		System.out.println(element1.getSize());
		System.out.println(drive.findElement(By.xpath("//button [@id='isDisabled']")).isEnabled());
		Actions actions = new Actions(drive); 
		WebElement element2 = drive.findElement(By.xpath("//h2[text()='Button Hold!']"));
		actions.clickAndHold(element2).perform();
		//drive.close();
		//drive.quit();
	}
}