package pageobjects.Without_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import corejava.Variables.WebElement.FB_SignIN;

public class Run_Facebook_Signin {

	public static void main(String[] args) {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(Facebook_SignIn.Email).clear();
		driver.findElement(Facebook_SignIn.Email).sendKeys("9030248855");
		
		driver.findElement(Facebook_SignIn.Password).clear();
		driver.findElement(Facebook_SignIn.Password).sendKeys("Hello");
		
		driver.findElement(FB_SignIN.login_btn).click();
		
		

	}

}
