package com.tests.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLocatorCssSelector {

	@Test
	public void VerifyCssSelector() throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
			WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
			WebElement login=driver.findElement(By.cssSelector("input.button"));
			

			username.sendKeys("Admin");
			password.sendKeys("admin123");
			login.click();
			Thread.sleep(5000);
			driver.quit();
		

	}

}
