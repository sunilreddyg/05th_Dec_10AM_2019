package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_All_Active_date_From_Datepicker {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//identify datepicker and click to Open
		WebElement DatePicker=driver.findElement(By.id("dpt_date"));
		DatePicker.click();
		Thread.sleep(3000);
		
		for (int i = 0; i < 5; i++) 
		{
			
			//Target Active month table
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			//Find list of active links available in current month
			List<WebElement> Active_links;
			Active_links=Active_month.findElements(By.tagName("a"));
			
			//Itearate for number of active links
			for (int j = 0; j < Active_links.size(); j++) 
			{
				Active_links.get(j).click();
				//Thread.sleep(1000);
				
				DatePicker.click();
				//Thread.sleep(500);
				
				//Restore all page references inorder to avoid "StaleElemnetReferenceException"
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_links=Active_month.findElements(By.tagName("a"));
			}
			
			if(i==3)
			{

				//Target Active month table
				WebElement Second_Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				System.out.println("Identified Second active table");
				
				//Select active date inoreder to bring SecondActive month dates to first active month
				Second_Active_month.findElements(By.tagName("a")).get(0).click();
				System.out.println("Selected  Active Date");
				Thread.sleep(1000);
				
				DatePicker.click();
				Thread.sleep(500);
			}
			
			
			
			WebElement Next_month_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_month_btn.click();
			Thread.sleep(2000);
			
		}
		
		
		
		
		

	}

}
