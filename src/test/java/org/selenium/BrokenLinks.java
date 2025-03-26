package org.selenium;

import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void handlingBrokenLinks(String link) throws IOException, MalformedURLException {
		URL url = new URL(link);
		HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
		httpurl.connect();
		int code = httpurl.getResponseCode();		
		if(code<400) {
			System.out.println("Valid Link: "+ link);
		}
		else {
			System.out.println("Broken Link: "+ link);
		}	
	}	
	public static void main(String[] args) throws AWTException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");  	
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement e: list) {
			@Nullable
			String link = e.getAttribute("href");
			BrokenLinks.handlingBrokenLinks(link);
		}
		System.out.println("---------------End---------------");
	}
}
