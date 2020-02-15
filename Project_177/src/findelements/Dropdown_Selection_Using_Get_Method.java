package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_Get_Method {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("month"))
		.findElements(By.tagName("option")).get(5).click();
		

		driver.findElements(By.tagName("select"))
		.get(0).findElements(By.tagName("option")).get(2).click();
	}

}
