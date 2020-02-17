package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_of_Dropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Dropdown 
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		
		//Using Select Class get all dropdown options
		List<WebElement> AllOptions=new Select(Month_Dropdown).getOptions();
		
		//Iterate using list of objects
		for (int i = 0; i < AllOptions.size(); i++) 
		{
			 AllOptions.get(i).click();
		}
		
		
		
		
		
	}

}
