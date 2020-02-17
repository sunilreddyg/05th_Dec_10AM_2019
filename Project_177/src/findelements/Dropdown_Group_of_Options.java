package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Group_of_Options {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify expected cities displayed
		 * 	w.r.t state selection.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
				
		String Exp_cities[]= 
			{
				"Please select state first",
				"South Andaman",		
				"Anantapur",
				"East Siang",
				"Darrang",
				"jdkfjld",
				"Chandigarh"
			};

		
		
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Find list of options available under Statedropdown
		List<WebElement> AllOptions=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for list of options
		for (int i = 0; i < 7; i++) 
		{
			//Get Each State using index number
			WebElement Eachstate=AllOptions.get(i);
			//Click Each State
			Eachstate.click();
			Thread.sleep(4000);
			
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			//Get All Option name under city dropdown
			String CityOptions=City_Dropdown.getText();
		
			if(CityOptions.contains(Exp_cities[i]))
			{
				System.out.println("for state "+Eachstate.getText()+"\t"+"\t"+" City displayed ==> "+Exp_cities[i]);
			}
			else
			{
				System.out.println("for state "+Eachstate.getText()+"\t"+"\t"+" City not displayed ");
			}
			
			
		}

	}

}
