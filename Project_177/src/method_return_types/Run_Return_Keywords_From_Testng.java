package method_return_types;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Run_Return_Keywords_From_Testng extends Keywords
{
  @Test(priority=0)
  public void Verify_FB_Homepage_title() 
  {
	  String Exp_title="Facebook – log in or sign up";
	  Assert.assertTrue(isTitle_Presented(Exp_title));
	  Reporter.log("facebook homepage title verified");
  }
  
  @Test(priority=1)
  public void Verify_Fb_Homepage_url()
  {
	  String Exp_url="https://www.facebook.com/";
	  Assert.assertTrue(is_Url_Presented(Exp_url));
	  Reporter.log("Facebook url presented");
  }
  
  @Test(priority=2)
  public void Verify_Fb_Homepage_Expected_text()
  {
	  String Exp_text="Create an account";
	  Assert.assertTrue(is_text_visible_At_Webpage(Exp_text));
	  Reporter.log("Expected text presented at webpage");
  }
  
  
  
  
  
  @BeforeClass
  public void Set_browser()
  {
	  Launch_Browser("chrome");
	  LaunchApp("http://facebook.com");
	  set_timeout(30);
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
