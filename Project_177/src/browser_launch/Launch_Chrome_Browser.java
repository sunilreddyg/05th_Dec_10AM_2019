package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args)
	{
		
		
		/*
		 * Note:--> Before launch chrome browser download
		 * 			chromedriver.exe file and Set Environment path.
		 * 		
		 * 		=> Steps to download chromedriver
		 * 			=> https://sites.google.com/a/chromium.org/chromedriver/
		 * 			=> click on  chromedriver w.r.t chrome browser version.
		 * 						chromebrowser version => 79
		 * 						chromedriver version  => 79.0.3945.36
		 * 			=> At chromedriver index page downlaod w.r.t Operating systems.
		 * 			=> It Download zip format file , After download unzip file to backup folder..
		 * 			
		 * 
		 */
		
		//Setting runtime environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//launching chrome browser and store chrome references into varaible
		ChromeDriver chrome=new ChromeDriver();
		//Using reference of chrome browser loading webpage.
		chrome.get("http://facebook.com");
		
		
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
