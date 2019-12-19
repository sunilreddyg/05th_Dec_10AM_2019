package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");
		
		
		/*
		 * Exception:-->
		 * 			IllegalstateException
		 * 					=>Avove exception display when Chromedriver.exe
		 * 					  file not create as system property.
		 * 		
		 * 			SessionNotCreate Exception
		 * 				   => When chromebrowser version and chromdriver 
		 * 					  mismatch abvoe exception display..
		 * 
		 * 			InvalidArgumentException
		 * 				   => When protocal mismatch, We must
		 * 						use browser protocal [http:// or https://]
		 */
		
		
	}

}
