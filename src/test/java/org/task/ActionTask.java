package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTask{

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://letcode.in/edit");
		WebElement web = drive.findElement(By.id("fullName"));

		Actions act=new Actions(drive);
		act.sendKeys(web,"V.K.Yasvika").perform();
		act.sendKeys(Keys.TAB).perform();
		WebElement web1 = drive.findElement(By.id("join"));
		act.sendKeys(web1,"  How about you?").perform();
		act.sendKeys(Keys.TAB).perform();
		WebElement web2 = drive.findElement(By.id("getMe"));
		System.out.println(web2.getAttribute("Id"));
		act.sendKeys(Keys.TAB).perform();
		WebElement web3 = drive.findElement(By.id("clearMe"));
		web3.clear();
		act.sendKeys(Keys.TAB).perform();
		System.out.println(drive.findElement(By.id("clearMe")).isEnabled());
	}	
}
