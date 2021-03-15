package com.build.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePageSetUp {
	
	public static WebDriver getDriver() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();;
	driver.get("http://amazon.com");
	return driver;
	}
	

}
