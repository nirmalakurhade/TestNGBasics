package com.jbk;


import java.util.concurrent.TimeUnit;

import org.openqa.grid.internal.listeners.Prioritizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PlayGround {
	WebDriver driver;
	Action a;
	Actions act;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		driver =  new ChromeDriver();
	    driver.get("https://javabykiran.com/");	
	    driver.navigate().to("http://javabykiran.com/playground/");
	    driver.manage().window().maximize();
	}
	@Test(priority = 1)
	public void linkText() {
		  act = new Actions(driver);
		  WebElement link = driver.findElement(By.linkText("GET Single User"));
		  act.moveToElement(link).perform();
	}
	@Test(priority = 2)
	public void DragDrop() {
		driver.navigate().to("http://javabykiran.com/playground/drag-and-drop");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		act = new Actions(driver);
		WebElement title = driver.findElement(By.xpath("//*[@id=\"nestable\"]/ol/li[1]/div"));//contact us
		WebElement exp = driver.findElement(By.xpath("//*[@id=\"nestable\"]/ol/li[4]/div"));//service
		act.dragAndDrop(title, exp ).perform();
		
	}
	@Test(priority = 3)
	public void downloadfile() {
		driver.navigate().to("http://javabykiran.com/playground/download-file");
		act = new Actions(driver);
		driver.findElement(By.id("download")).click();
		act.perform();
	}

}











