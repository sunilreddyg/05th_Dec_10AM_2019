package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Text_visible_At_Location {

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
									   
		WebDriver driver=new ChromeDriver();     //Launch browser
		driver.get("https://outlook.com");       //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		
	
		By Singin_btn=By.xpath("(//a[contains(.,'Sign in')])[1]");
		new WebDriverWait(driver, 10).until
		(ExpectedConditions.elementToBeClickable(Singin_btn)).click();
		
		
		By Singin_Header=By.xpath("//div[@role='heading']");
		new WebDriverWait(driver, 100).until
		(ExpectedConditions.textToBePresentInElementLocated(Singin_Header, "Log in"));
		System.out.println("verified text visible at location");
		
		
		
	}

}
