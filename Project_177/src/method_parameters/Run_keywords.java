package method_parameters;

import org.openqa.selenium.By;

public class Run_keywords 
{

	public static void main(String args[])
	{
		
		//Create object for keywords class
		Keywords obj=new Keywords();
		obj.Launch_Browser("firefox");
		obj.LaunchApp("http://facebook.com");
		obj.set_timeout(30);
		
		//Type Text into editbox using xpath locator
		obj.Enter_text("//input[@name='email']", "9030248855");
		obj.Enter_text("//input[@name='pass']", "Hello12345");
		
		//type text into editbox using different locators
		obj.Enter_text(By.cssSelector("#u_0_m"), "Kalyan");
		obj.Enter_text(By.name("lastname"), "Krishna");
		
		
		//Select Dropdown option
		obj.select_dropdown("//select[@aria-label='Day']", "12");
		obj.select_dropdown(By.id("month"), "Dec");
		
		
		//Select radio button
		obj.click_element("//input[@value='1']");
		obj.capturescreen("Registration");
		
		
		
		
	}

}
