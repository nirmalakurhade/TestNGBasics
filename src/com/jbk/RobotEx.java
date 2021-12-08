package com.jbk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotEx {

	WebDriver driver;
	Robot r;

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
        WebElement logo = driver.findElement(By.tagName("img"));
        Actions act = new Actions(driver);
        act.contextClick(logo).perform();
        act.pause(5000).perform();
        r= new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.delay(10000);
        r.keyPress(KeyEvent.VK_ENTER);
        }
}
