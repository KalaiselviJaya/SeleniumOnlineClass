package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRobotDemo {

public static void main(String[] args) throws AWTException {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/"); 
		
		WebElement web = drive.findElement(By.id("email"));
		Actions act=new Actions(drive);
		
		act.sendKeys(web,"vickythamil@gmail.com").perform();
		
	//	ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	// ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
	// tab
		act.sendKeys(Keys.TAB).perform();
		
	// ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	// Enter
		act.sendKeys(Keys.ENTER).perform();
		
//		Robot rbt=new Robot();
//		rbt.keyPress(KeyEvent.VK_TAB);
//		rbt.keyRelease(KeyEvent.VK_TAB);
	}
}
