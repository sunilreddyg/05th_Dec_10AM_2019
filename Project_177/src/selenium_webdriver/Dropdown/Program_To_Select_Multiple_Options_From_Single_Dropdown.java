package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_To_Select_Multiple_Options_From_Single_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
	    driver.manage().window().maximize();
	    
	   
	   /*
	    * Usning javascript convert single option dropdown to multiple
	    * option dropdown..
	    */
	   ((JavascriptExecutor)driver).executeScript
	   ("document.getElementById('customState').setAttribute('multiple','multiple')");	   
	   Thread.sleep(3000);
	   
	   
	   
	   boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
	   System.out.println("Dropdown multiple selection state is => "+flag);
	   
	   
	   //Decision to accept block of code execution on Multiple Selection
	   if(flag==true)
	   {
		   System.out.println("dropdown is a multiple selection type");
		   
		   Select StateDropdown=new Select(driver.findElement(By.id("customState")));
		   StateDropdown.selectByIndex(3);
		   StateDropdown.selectByIndex(6);
		   StateDropdown.selectByIndex(9);
	   }
	   else
	   {
		   System.out.println("Dropdown is not a multiple selection type");
	   }
	   
	  
	   
	   
		

	}

}
