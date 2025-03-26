package org.task;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTask {

	public static void capture() throws AWTException, IOException {
		
		Robot r = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage capture = r.createScreenCapture(rect);
		File f = new File("./screenShot/login"+System.currentTimeMillis()+".png");	
		ImageIO.write(capture,"png",f);	
	}
	
public static void main(String[] args) throws AWTException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");  
	
	WebElement element = driver.findElement(By.xpath("//input [@type='text']"));
	element.sendKeys("student");
	ScreenShotTask.capture();
	
	WebElement element1 = driver.findElement(By.xpath("//input [@type='password']"));
	element1.sendKeys("Password123");
	ScreenShotTask.capture();
	
	}
}
