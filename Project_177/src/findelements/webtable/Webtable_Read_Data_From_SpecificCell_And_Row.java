package findelements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Read_Data_From_SpecificCell_And_Row {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx#");
		driver.manage().window().maximize();
		
		//Identify market link
		WebElement markets_link=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		markets_link.click();
		
		
		//Read data from webtable using specific row and cell..
		
		//Target Webtable..
		WebElement Table=driver.findElement(By.xpath("//div[@id='dvToplooser']/table"));
		
		//Find list of rows under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Get seelcted row using index number
		WebElement SelectedRow=rows.get(6);
		
		//Find list of cells under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Get first cell and 4th cell from selected row
		String CompanyName=cells.get(0).getText();
		String HighPrice=cells.get(3).getText();
		
		System.out.println(CompanyName+"   "+HighPrice);
	}

}
