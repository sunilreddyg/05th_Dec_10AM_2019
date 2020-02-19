package findelements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_SpecificRow_Data_From_Dynamic_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx#");
		driver.manage().window().maximize();
		
		//Identify market link
		WebElement markets_link=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		markets_link.click();
		
		
		//FAQ:-->Readdata from dynamic table using any record name..
		
		//Target Webtable..
		WebElement Table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Get Number or rows
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++)
		{
			 //Get all rows using increment
			WebElement Eachrow=rows.get(i);
			
			//Get Each row text
			String RowText=Eachrow.getText();
			if(RowText.contains("ONGC"))
			{
				System.out.println("Record available at row => "+i);
				//Findt list of cell available under each row
				List<WebElement> cells=Eachrow.findElements(By.tagName("td"));
				
				//Get first cell and 4th cell from selected row
				String CompanyName=cells.get(0).getText();
				String HighPrice=cells.get(3).getText();
				String LowPrice=cells.get(4).getText();
				
				System.out.println(CompanyName+"        "+HighPrice+"        "+LowPrice);
			}
			
			
			
		}
		

	}

}
