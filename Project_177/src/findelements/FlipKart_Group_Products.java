package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Group_Products {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy%2C4io&otracker=nmenu_sub_Electronics_0_Mi&page=1");			  
		driver.manage().window().maximize();
		
		
		WebElement Next_link;
		Next_link=driver.findElement(By.xpath("//span[text()='Next']"));
		
		
		do {
			
			
			//Identify Products table
			WebElement Products_Table=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='t-0M7P _2doH3V']/div[@class='_3e7xtJ']/div[@class='_1HmYoV hCUpcT']/div[2]"));
			//Find list of products available
			List<WebElement> Products=Products_Table.findElements(By.className("bhgxx2"));
			System.out.println("List of products available =>m "+Products.size());
			
			//Iterate for number of products
			for (int i = 1; i < Products.size()-2; i++) 
			{
				WebElement Eachprodcut=Products.get(i);
				WebElement Product_Name_loc=Eachprodcut.findElement(By.className("_3wU53n"));
				String ProductName=Product_Name_loc.getText();
				System.out.println(ProductName);
				
			}
			
			
			
			if(Next_link.isDisplayed())
					Next_link.click();
			
			
			//Restore reference to avoid stalelement reference exception
			try {
				Thread.sleep(3000);
				Next_link=driver.findElement(By.xpath("//span[text()='Next']"));
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			
			
			
			
		} while (Next_link.isDisplayed());
		
		
		
		

	}

}
