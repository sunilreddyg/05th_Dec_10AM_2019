package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Table_Records_Using_GetText {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * 		Scenario:
		 * 				Verifying TogGainers Records
		 * 				
		 * 				Given site url "http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx"
		 * 				When click Markets link
		 * 				And wait until topgainers table update
		 * 				Then verify expected company shares available at topgainers table.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
	    driver.manage().window().maximize();
	    
	    
		WebElement Markets_link=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets_link.click();
		Thread.sleep(5000);
		
		
		//Identify Top-Gainers table
		WebElement Gainers_Table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		//Capture all visible records under gainers table
		String All_Records=Gainers_Table.getText();
		
		//Verify Axisbank record available at gainers table
		if(All_Records.contains("INDBA"))
		{
			System.out.println("Record found at gainers table");
		}
		else
		{
			System.out.println("record not found at gainers table");
		}

	}

}
