package org.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {

public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://letcode.in/alert"); 
		
		WebElement web = drive.findElement(By.xpath("//button[text()='Simple Alert']"));
		web.click();
		
		Alert simple=drive.switchTo().alert();
		simple.accept();
		
		WebElement web1 = drive.findElement(By.xpath("//button[text()='Confirm Alert']"));
		web1.click();
		
		Alert confirm=drive.switchTo().alert();
		confirm.dismiss();
		
		WebElement web2 = drive.findElement(By.xpath("//button[text()='Prompt Alert']"));
		web2.click();
		
		Alert prompt=drive.switchTo().alert();
		prompt.sendKeys("Kalai");
		prompt.accept();
		
		WebElement web3 = drive.findElement(By.xpath("//button[text()='Modern Alert']"));
		web3.click();
		
		WebElement close = drive.findElement(By.xpath("//button[@class='modal-close is-large']"));
		close.click();

	}
}
