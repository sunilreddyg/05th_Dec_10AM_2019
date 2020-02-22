package pageobjects.PageFactory.With_Global_Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CT_Hotels 
{
	WebDriver driver;
	String Hotels_url="https://www.cleartrip.com/hotels";
	
	public CT_Hotels(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		driver.get(Hotels_url);
	}
	
	
	@FindBy(xpath = "//input[@id='Tags']")
	public WebElement Where_locality_EB;
	

	public String Exp_hotels_HeaderText="Search for hotels";
	
	/*
	 * Method:--> Verifying page availability
	 */
	public void Verify_Hotels_page_Header()
	{
		String Hotels_visible_Text=driver.findElement
				(By.tagName("body")).getText();
		
		if(Hotels_visible_Text.contains(Exp_hotels_HeaderText))
		{
			System.out.println("hotel header text visible at webpage");
		}
		else
		{
			System.out.println("Hotel header text not visible at webpage");
		}
	}
	
	/*
	 * Method:--> Close browser window
	 */
	public void Close_Browser()
	{
		driver.close();
	}
	
	

}
