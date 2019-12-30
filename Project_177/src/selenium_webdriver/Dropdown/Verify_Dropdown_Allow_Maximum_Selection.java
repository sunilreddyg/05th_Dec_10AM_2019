package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Maximum_Selection {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:-->
		 * 		Verifying stateSelection dropdown accepting maximum
		 * 		selection upto 3..
		 */
		
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
	   
		
	   //Decision statement to execute on multiple selection type
	   if(flag==true)
	   {
		   System.out.println("Dropdown is multiple selection type");
		   
		   //Deselecting  selections at dropdown 
		   //[this command supports only on multiple selection types]
		   Select StateDropdown=new Select(driver.findElement(By.id("customState")));
		   StateDropdown.deselectAll();
		   
		   //select options at dropdown
		   StateDropdown.selectByIndex(3);
		   StateDropdown.selectByIndex(6);
		   StateDropdown.selectByIndex(9);
		   
		   
		   int Selection_count=StateDropdown.getAllSelectedOptions().size();
		   System.out.println("Selection count is => "+Selection_count);
		   
		   
		   //Condition to verify Selection Count
		   if(Selection_count==3)
		   {
			   System.out.println("Testpass:--> Selection Count reach as expected");
		   }
		   else
		   {
			   System.out.println("Testfail:--> Selection count mismatch with expected count");
		   }
		   
	   }
	   else
	   {
		   System.out.println("Dropdown is not a multiple selection type");
	   }

	}

}
