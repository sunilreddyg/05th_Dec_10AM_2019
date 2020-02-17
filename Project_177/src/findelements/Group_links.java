package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
		
		//findout list of link under footer area
		List<WebElement> FooterLinks;
		FooterLinks=Footer_Area.findElements(By.tagName("a"));
		
		//Iterate for number of links
		for (int i = 0; i < FooterLinks.size(); i++) 
		{
			//Get Each link using index number
			WebElement Each_link=FooterLinks.get(i);
			
			//Get Linkname and attribute
			String linkname=Each_link.getText();
			String linkhref=Each_link.getAttribute("href");
			
			System.out.println(linkname+"      "+linkhref);
			
			
			//Click Each link
			Each_link.click();
			Thread.sleep(3000);
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Restore page identification to avoid "stalelementreference" exception
			Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
			FooterLinks=Footer_Area.findElements(By.tagName("a"));
		}
		
	}

}
