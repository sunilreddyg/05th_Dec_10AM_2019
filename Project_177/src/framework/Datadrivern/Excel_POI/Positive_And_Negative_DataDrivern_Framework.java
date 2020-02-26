package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.math.Expression;

public class Positive_And_Negative_DataDrivern_Framework {

	public static void main(String[] args) throws Exception {
		
		//target file location using FileinputStream
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook using fileinputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet access using workbook
		XSSFSheet sht=book.getSheet("Sheet5");
		
		//Get Number of rows data count
		int Rcount=sht.getLastRowNum();
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Iterate for number of rows
		for (int i = 6; i <= Rcount; i++) 
		{
			String Exe_status=sht.getRow(i).getCell(6).getStringCellValue();
			
			//Condition for execution status
			if(Exe_status.equalsIgnoreCase("y"))
			{
				//static Data
				String URL=sht.getRow(4).getCell(1).getStringCellValue();
				String Signin_link_loc=sht.getRow(6).getCell(1).getStringCellValue();
				String Email_loc=sht.getRow(6).getCell(2).getStringCellValue();
				String Next_btn_loc=sht.getRow(6).getCell(4).getStringCellValue();
				
				//Dynamic Row data
				String TestName=sht.getRow(i).getCell(0).getStringCellValue();
				String Email_input=sht.getRow(i).getCell(3).getStringCellValue();
				String Exp_result=sht.getRow(i).getCell(5).getStringCellValue().trim();
				//System.out.println(Exp_result);
				//Load page url
				driver.get(URL);
				
				//Click singin link
				driver.findElement(By.xpath(Signin_link_loc)).click();
				
				driver.findElement(By.xpath(Email_loc)).clear();
				driver.findElement(By.xpath(Email_loc)).sendKeys(Email_input);
				
				//Click Next button
				driver.findElement(By.xpath(Next_btn_loc)).click();
				Thread.sleep(5000);
				
				//Get Scenario Type from Excel
				String Stype=sht.getRow(i).getCell(7).getStringCellValue();
				if(Stype.equals("text"))
				{
					//Captur Current page visible text
					String PageText=driver.findElement(By.tagName("body")).getText().trim();
					//System.out.println(PageText);
					if(PageText.contains(Exp_result))
					{
						sht.getRow(i).createCell(8).setCellValue("Testpass");
						System.out.println(TestName+"    "+"Testpass");
					}
					else
					{
						sht.getRow(i).createCell(8).setCellValue("TestFail");
						System.out.println(TestName+"    "+"TestFail");
					}
				}
				else if(Stype.equals("object"))
				{
					 boolean flag=driver.findElement(By.xpath(Exp_result)).isDisplayed();
					 if(flag==true)
					 {
						 
						 	sht.getRow(i).createCell(8).setCellValue("Testpass");
							System.out.println(TestName+"    "+"Testpass");
					 }
					 else
					 {
						    sht.getRow(i).createCell(8).setCellValue("TestFail");
							System.out.println(TestName+"    "+"TestFail");
					 }
				}
				else
				{
					System.out.println("Scenario type mismatch");
				}
				
				
			}//Exe_status
			
		
		}//for
		
		//Write and save data [Write this statement outside loop]
		book.write(new FileOutputStream("TestData\\Neg_OP.xlsx"));
		book.close();
		
		
	}

}
