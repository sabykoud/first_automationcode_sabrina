package com.automation_class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_First_Automationcode {
	//Ctrl+shift+o to import 

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.rediff.com");
	    driver.quit();
	
		WebDriver driver1= new FirefoxDriver();
		driver1.manage().window().minimize();
		driver1.get("https://www.amazon.com");
		driver1.quit();

		WebDriver driver2= new EdgeDriver();
		driver2.manage().window().minimize();
		driver2.get("https://www.flipkart.com");
		driver2.quit();

	}

}
