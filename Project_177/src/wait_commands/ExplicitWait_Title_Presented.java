package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Title_Presented 
{
	public static void main(String[] args)
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
									    
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		
		//Create object to assign explicit time at automation browser.
		new WebDriverWait(driver, 20).until
		(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		System.out.println("Title verified");
		
		/*
		 * Explicitwait throws exception on timeout finish.
		 * 			"TimeoutException"
		 * 	
		 */
		
		//Click download button
		WebElement Download_link=driver.findElement(By.xpath("//div[contains(@class,'download-button webdriver')]"));
		Download_link.click();
		
		
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.titleContains("Downloads"));
		System.out.println("download page title verified");
		
		
		//Wit until element is visible
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.visibilityOfElementLocated
			(By.xpath("//a[@href='https://bit.ly/2TlkRyu']"))).click();

	}

}
