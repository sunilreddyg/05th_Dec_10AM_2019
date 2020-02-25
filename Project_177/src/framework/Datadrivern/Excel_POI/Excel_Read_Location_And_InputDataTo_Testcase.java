package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_Location_And_InputDataTo_Testcase {

	public static void main(String[] args) throws IOException 
	{
		//Target Excel binary file
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook using above fileinputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook accesed");
		
		//Target a sheet at workbook using sheetname
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Target row using sheetname
		XSSFRow row=sht.getRow(1);
		
		//Target cell and get cell value 
		String Outlook_url=row.getCell(1).getStringCellValue();
		String Sign_In_link=row.getCell(2).getStringCellValue();
		String Email_loc=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		String Email_next_btn_loc=row.getCell(5).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Outlook_url);
		driver.manage().window().maximize();
		
		//Clck Signin link
		driver.findElement(By.xpath(Sign_In_link)).click();
		
		//Type email
		WebElement Email_textbox=driver.findElement(By.xpath(Email_loc));
		Email_textbox.clear();
		Email_textbox.sendKeys(Email_input);
		
		//Click Next button
		driver.findElement(By.xpath(Email_next_btn_loc)).click();
		
		
		
		
		
		
		
		

	}

}
