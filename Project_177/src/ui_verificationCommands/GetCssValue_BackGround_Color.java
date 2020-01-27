package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue_BackGround_Color 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    //Identify Sensex tab
	    WebElement Sensex_Tab=driver.findElement(By.id("InvestRec"));
	    
	    
	    //Get back-ground-color at runtime
	    String Color1=Sensex_Tab.getCssValue("background-color");
	    System.out.println("Before selection background color is => "+Color1);
	    
	    
	    //Select sensex tab
	    Sensex_Tab.click();
	    Thread.sleep(2000);
	    
	    String Color2=Sensex_Tab.getCssValue("background-color");
		System.out.println("After slection background color is => "+Color2);
		
		
		if(Color2.equals("rgba(231, 120, 23, 1)"))
			System.out.println("Sensex tab is selected");
		else
			System.out.println("Sensex tab is not selected");
		
	}

}
