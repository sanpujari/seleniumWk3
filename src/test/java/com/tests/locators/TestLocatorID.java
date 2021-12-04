/* 
 * Test case 1: To Verify ID locator
 * Locator ID: > ID is unique identifier for the element and it does not change.
 *             > Reliable way to locate elements
 *             > Faster
 */
package com.tests.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLocatorID {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}

	@Test
    public void VerifyLocatorID() throws InterruptedException {
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement login = driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		login.click();
		
		Thread.sleep(5000);		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
