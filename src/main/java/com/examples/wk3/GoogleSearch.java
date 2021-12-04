package com.examples.wk3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException{

		// setting driver property with path
		WebDriverManager.chromedriver().setup();
		// creating an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		//loading the web page/ launching the web page
		driver.get("http://www.google.com/");
		// maximizing the browser window
		driver.manage().window().maximize();
		// wait for ms time
		Thread.sleep(5000);   
		// used to identify web element 
		WebElement searchBox = driver.findElement(By.name("q")); 
		// allow to type content into edit fields
		searchBox.sendKeys("selenium"); 
		// submits - similar to click
		searchBox.submit();    
		// waiting for some time
		Thread.sleep(5000);  
		// Quitting, closes the browser session - safely ends the session.
		driver.quit();  
}

}
