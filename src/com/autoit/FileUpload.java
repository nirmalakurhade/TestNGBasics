package com.autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
 WebDriver driver;
 @Test
 public void Setup() throws Exception {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); 
		driver =  new ChromeDriver();
	    driver.get("https://javabykiran.com/playground/");	
	    driver.findElement(By.linkText("File Upload")).click();
	    driver.findElement(By.id("file")).click();
	    Thread.sleep(5000);
	    Runtime.getRuntime().exec("D:\\AutoIT\\demo.exe");
	    
 }
}
