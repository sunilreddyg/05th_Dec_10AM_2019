package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_Source {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com/");
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(10000);
	    
	    String Runtime_source=driver.getPageSource();
	    
	    if(Runtime_source.contains("i0116"))
	    {
	    	WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
	    	Email.clear();
	    	Email.sendKeys("sunil");
	    }
	    else
	    {
	    	System.out.println("Element Not presented at source");
	    }
	}

}
