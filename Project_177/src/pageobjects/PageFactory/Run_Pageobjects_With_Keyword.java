package pageobjects.PageFactory;

import org.testng.annotations.Test;

import method_parameters.Keywords;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class Run_Pageobjects_With_Keyword extends Keywords
{
	CT_Search_Flights search_Flight;
  @Test
  public void SearchFlight_For_Roundtrip() 
  {
	  click_element(search_Flight.Roundtrip_Radio_btn);
	  Enter_text(search_Flight.From_EB, "H"+Keys.ARROW_RIGHT+"YD");
	  click_element(search_Flight.Hyd_City_Airport);
	  
  }
  @BeforeClass
  public void beforeClass() throws Exception 
  {
	  Launch_Browser("chrome");
	  LaunchApp("http://cleartrip.com");
	  Thread.sleep(5000);
	  set_timeout(30);
	  search_Flight=PageFactory.initElements(driver, CT_Search_Flights.class);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(4000);
	  driver.close();
  }

}
