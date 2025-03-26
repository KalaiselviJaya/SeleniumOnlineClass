package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MockInterview {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		driver.manage().window().maximize();
		
//Test Case 1	
				WebElement disabledinput =driver.findElement(By.xpath("//input[@name='my-disabled']"));
				if (!disabledinput.isEnabled()) {
		            System.out.println("Test Case 1 is Pass: The Disabled input is disabled from the form.");
		        } else {
		            System.out.println("Test Case 1 is Fail: The Disabled input is enabled from the form.");
		        }
				
//Test Case 2				
				WebElement read1 = driver.findElement(By.xpath("//input[@name='my-readonly']"));
				WebElement read2 = driver.findElement(By.xpath("//input[@readonly]"));				
				 if (read1.equals(read2) && read1 != null) {
			            System.out.println("Test Case 2 is Pass: The Readonly input field is readonly.");
			        } else {
			            System.out.println("Test Case 2 is Fail: The Readonly input field is not readonly.");
			        }
//Test Case 3					
				WebElement select1 = driver.findElement(By.xpath("//select[@name='my-select']"));
				WebElement select2 = driver.findElement(By.xpath("//select[@class='form-select']"));
				Select s= new Select(select1);
				if(select1.equals(select2) && s.getOptions().size()==8) {
					 System.out.println("Test Case 3 is Pass: The select color is having 8 elements");
		        } else {
		             System.out.println("Test Case 3 is Fail: The Select color is doesn't having 8 elements");
		        }
				
//Test Case 4	
				WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
				if (!submit.isEnabled()) {
		            System.out.println("Test Case 4 is Pass: The submit button is disabled when no data is entered in Name and Password field.");
		        } else {
		            System.out.println("Test Case 4 is Fail: The submit button enabled when both Name and Password field is entered.");
		        }
		
//Test Case 5		
				WebElement name = driver.findElement(By.xpath("//input[@id='my-name-id']"));
				name.sendKeys("Kalai");
				WebElement password =driver.findElement(By.xpath("//input[@id='my-password-id']"));
				password.sendKeys("Test123");
				if (submit.isEnabled()) {
		            System.out.println("Test Case 5 is Pass: The submit button enabled when both Name and Password field is entered.");
		        } else {
		            System.out.println("Test Case 5 is Fail: The submit button is disabled when no data is entered in Name and Password field.");
		        }
				submit.click();
//Test Case 6
				WebElement receivedText = driver.findElement(By.xpath("//p[contains(text(),'Received')]"));
		        if (receivedText.isDisplayed()) {
		            System.out.println("Test Case 6 is Pass: The Received text is displayed.");
		        } else {
		            System.out.println("Test Case 6 is Fail: The Received text is not displayed.");
		        }
//Test Case 7		        
		        String currentUrl = driver.getCurrentUrl();
		        if (currentUrl.contains("name=Kalai") && currentUrl.contains("password=Test123")) {
		            System.out.println("Test Case 7 is Pass: The form all the data passed to the URL.");
		        } else {
		            System.out.println("Test Case 7 is Fail: The form all the data not passed to the URL.");
		        }    
		        
		        driver.quit();
	}
}
