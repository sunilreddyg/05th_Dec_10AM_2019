package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dynamic_Row_Data_Using_Conditions 
{

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using sheetname
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Get Number of rows data available
		int Rcount=sht.getLastRowNum();
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount; i++) 
		{
			//Get Execution Status
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				//Read Username and Password
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(UID+"     "+PWD);
				
				//get Scenario type
				String SType=sht.getRow(i).getCell(3).getStringCellValue().trim();
				
				if(SType.equals("text"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"text captured");
				}
				else if(SType.equals("alert"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"alert handled");
				}
				else if(SType.equals("p"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"Element displayed");
				}
				else if(SType.equals("n"))
				{
					System.out.println(UID+"   "+PWD+"  => "+"Error displayed");
				}
				else
				{
					System.out.println("Scenario type mismatch");
				}
			}
			
		}

	}

}
