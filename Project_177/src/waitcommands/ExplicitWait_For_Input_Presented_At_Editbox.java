package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_Input_Presented_At_Editbox 
{

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://outlook.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window

		
		By Singin_btn=By.xpath("(//a[contains(.,'Sign in')])[1]");
		new WebDriverWait(driver, 10).until
		(ExpectedConditions.elementToBeClickable(Singin_btn)).click();
		
		
		By Email_Loc=By.xpath("//input[@id='i0116']");
		WebElement Email_EB=new WebDriverWait(driver, 10).until
		(ExpectedConditions.visibilityOfElementLocated(Email_Loc));
		
		Email_EB.clear();
		Email_EB.sendKeys("mindq");
		
		
		//Write a program to wait until expected input value presented at editbox.
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.textToBePresentInElementValue(Email_Loc, "mindqdsnr"));
		System.out.println("Expected input presented at editbox");
		
		
		
		
		
		
		
		
		
		

	}

}
