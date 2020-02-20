package findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Required_Data_From_DatePicker 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//identify datepicker and click to Open
		WebElement DatePicker=driver.findElement(By.id("dpt_date"));
		DatePicker.click();
		Thread.sleep(3000);
		
		String Exp_month="March 2020";
		String Exp_date="26";
		
		//Iterate number of months
		for (int i = 0; i < 3; i++) 
		{
			
			//Identify Active Month table Header location
			WebElement Month_Header=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]/thead/tr[1]/th"));
			//Get Header text 
			String Runtime_month=Month_Header.getText();
			
			//Condition to accept on expected month
			if(Runtime_month.equals(Exp_month))
			{
				//Select Date from acitive month
				driver.findElement(By.linkText(Exp_date)).click();
				break; //stop iteration after selection of date
			}
			
			WebElement Next_month_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_month_btn.click();
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
	}

}
