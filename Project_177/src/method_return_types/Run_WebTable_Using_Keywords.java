package method_return_types;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Run_WebTable_Using_Keywords extends Keywords
{
	
	
	
	
	@Test
	public void Get_Data_From_Static_WetbTable()
	{
		WebElement Company_Cell=Get_Static_Webtable_Cell("//div[@id='dvToplooser']/table", 5, 0);
		String CompanyName=Company_Cell.getText();
		System.out.println("Company name at fifth position is => "+CompanyName);
		
		WebElement HighPrice_Cell=Get_Static_Webtable_Cell("//div[@id='dvToplooser']/table", 5, 3);
		String HighPrice=HighPrice_Cell.getText();
		System.out.println("High price value is  => "+HighPrice);
	
	}
	
	
	@Test
	public void Get_Dynamic_Cell_info()
	{
		
		Get_Dynaic_Webtable_Cell("//div[@id='dvToplooser']/table", "TCS", 7).click();
	}
	
	
	
	
	
	
	
	
	 @BeforeClass
	  public void Set_browser()
	  {
		  Launch_Browser("chrome");
		  LaunchApp("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		  set_timeout(30);
		  click_element("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]");
	  }
	  
	  @AfterClass
	  public void Close_Browser() throws Exception
	  {
		  Thread.sleep(5000);
		  driver.close();
		  /*
		   * 	driver is a global variable at Keyword Class, Becuase
		   * 	keyword class inherited to current class we can user 
		   * 	keyword class global variables and mehtods directly
		   * 	without object creation..
		   * 
		   */
		  
	  }

}
