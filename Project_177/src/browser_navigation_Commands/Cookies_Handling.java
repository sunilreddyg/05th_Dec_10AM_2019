package browser_navigation_Commands;

import java.net.CookiePolicy;
import java.util.Date;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Handling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Delete Previous history before start new sesssion
		driver.manage().deleteAllCookies();
		
		//Add Cookie to browser window
		Cookie New_Cookie=new Cookie("Hi", "100000012kdjflkdsjf");
		driver.manage().addCookie(New_Cookie);

		//Get Cookie value at runtime using cookie name
		Cookie New_Cookie1=driver.manage().getCookieNamed("Hi");
		System.out.println(New_Cookie1.getValue());
		
		//Get Cookie Expiry data
		Date Edate=driver.manage().getCookieNamed("Hi").getExpiry();
		System.out.println("Cookie Expiry date is => "+Edate);
		
		//Get Cookie Path
		String Cookie_path=driver.manage().getCookieNamed("Hi").getPath();
		System.out.println("Cookie path is => "+Cookie_path);
	
		//Delete Cookie using Name..
		driver.manage().deleteCookieNamed("Hi");
		//Delete Cookie using CookieName and value
		driver.manage().deleteCookie(New_Cookie);
		
		
		
		
		

	}

}
