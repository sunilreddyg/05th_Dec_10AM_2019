package corejava.Loops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * while:-->
		 * 		=> While is a condition based loop.
		 * 		=> While accept loop when condition return true
		 * 			and continue iteration until condition return false.
		 * 		=> During while loop we should provide icrement/decrement
		 * 			or Any condition to break loop othewise it get into
		 * 			infinity loop.
		 * 
		 * 
		 * 		Syntax:--> 
		 * 				while(condition)
		 * 				{
		 * 
		 * 				}
		 */
		
		
		
		//Example:--> Print numbers 1 to 10 using while loop
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		//Example:--> Using while loop read all items from collection
		
		//Unorder collection of objects.
		Set<String> col=new HashSet<String>();
		col.add("IDE");
		col.add("RC");
		col.add("GRID");
		col.add("WD");
		
		//Get Unorder collection of objects to iterators.
		Iterator<String> itr=col.iterator();
		
		//Using condition loop iterate until last iterator
		while(itr.hasNext())
		{
			String obj=itr.next();
			System.out.println(obj);
		}
	
		
		
		
		
		
		
		
		//Example:--> Using while loop manage explicit wait.
		
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		int j=0;
		while(!Retype_Email.isDisplayed())
		{
			j=j+1;
			Thread.sleep(1000);
			
			if(j==30)
			{
				throw new ElementNotVisibleException("Verified up to 30 seconds");
			}
		}
		
		
		
		System.out.println("Element visible at webpage");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
