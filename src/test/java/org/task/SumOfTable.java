package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumOfTable {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://reshmi-02.github.io/table1/"); 
	
		List<WebElement> fees = driver.findElements(By.xpath("//table//tr/td[4]"));
		int total=0;
		
		for(WebElement amount: fees) {
			String feeText = amount.getText().replace(",", "").trim();
            try {
                int fee = Integer.parseInt(feeText);
                total=total+ fee;
            } catch (NumberFormatException e) {
                System.out.println( feeText);
            }
		}
		System.out.println(total);
		
		
	}
}
