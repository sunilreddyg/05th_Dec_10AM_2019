package browser_navigation_Commands;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Cookies 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//maximize window
		driver.manage().window().maximize();
		
		driver.manage().deleteCookieNamed("wd");
		
		
		Set<Cookie> All_Cookies=driver.manage().getCookies();
		for (Cookie EachCookie : All_Cookies) 
		{
			String DomainName=EachCookie.getDomain();
			System.out.println("DomainName is => "+DomainName);
			
			
			Date Edate=EachCookie.getExpiry();
			System.out.println("Cookie ExpiryDate is => "+Edate.toString());
			
			
			String CookieName=EachCookie.getName();
			String CookieValue=EachCookie.getValue();
			System.out.println(CookieName+"  "+CookieValue);
		}
		
		
		

	}

}
