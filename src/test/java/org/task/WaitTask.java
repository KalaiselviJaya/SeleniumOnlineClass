package org.task;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTask {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement web = driver.findElement(By.xpath("//button[@id='accept']"));
		web.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
//		element.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Message: " + alert.getText());
		alert.accept();
		
}
}
