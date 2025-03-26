package org.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement  web = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		web.sendKeys("Selenium");
		web.sendKeys(Keys.ENTER);
		
		List<WebElement>  data = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
		for (WebElement site: data) {
			site.click();
		}

		// To get current window & title
//		String currentwindow = driver.getWindowHandle(); 
//		
//		System.out.println(currentwindow);
//		System.out.println(driver.getTitle());
	
		// To switch multi window & get title
		
		Set<String> multiwindows = driver.getWindowHandles();		
//		for (String windows: multiwindows) { 			
//			System.out.println("id:"+windows);
//			driver.switchTo().window(windows);
//			System.out.println(driver.getTitle());
//		}
		
		// To switch particular window & get title	
		for (String windows: multiwindows) { 			
			driver.switchTo().window(windows);
			
			if(driver.getTitle().equalsIgnoreCase("Selenium - Wikipedia")) {
			System.out.println(driver.getTitle());
			//driver.close();
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys("India");
			break;
			}
			Thread.sleep(2000);
		}
		
	}
}
