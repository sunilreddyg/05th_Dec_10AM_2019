package selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox_Using_LInks {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://hdfcbank.com");
	    driver.manage().window().maximize();
	    Thread.sleep(30000);
	    
	    driver.findElement(By.linkText("Select Product Type")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/ul/li[6]")).click();
	    

	}

}
