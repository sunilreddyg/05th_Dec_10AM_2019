package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Visibility_of_Element_Located {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
	    driver.manage().window().maximize();
	    
	    //Enable explicit wait on automation browser..
	    WebDriverWait wait=new WebDriverWait(driver, 30);
	    
	    
	  By Email_locator= By.xpath("//input[@type='email']");
	  WebElement Email_Textbox=wait.until
			  (ExpectedConditions.visibilityOfElementLocated(Email_locator));
	  Email_Textbox.clear();
	  Email_Textbox.sendKeys("qadarshan@gmail.com");
	  
	  
	  By Email_next_btn_locator=By.xpath("//span[@class='RveJvd snByac'][contains(.,'Next')]");
	  wait.until(ExpectedConditions.elementToBeClickable(Email_next_btn_locator)).click();
	  
	  
	  By Password_locator=By.xpath("//input[@type='password']");
	  WebElement Password_Textbox=wait.until
			  (ExpectedConditions.visibilityOfElementLocated(Password_locator));
	  Password_Textbox.clear();
	  Password_Textbox.sendKeys("hello12345");
	  
	  
	  
	  
	  
	}

}
