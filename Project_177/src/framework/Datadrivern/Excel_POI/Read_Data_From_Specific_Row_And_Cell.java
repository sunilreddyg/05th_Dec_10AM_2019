package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Specific_Row_And_Cell {

	public static void main(String[] args) throws IOException 
	{
		
		
		
			
			//Target Excel binary file
			FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("file located");
			
			//Access workbook using above fileinputstream
			XSSFWorkbook book=new XSSFWorkbook(fi);
			System.out.println("Workbook accesed");
			
			//Target a sheet at workbook using sheetname
			XSSFSheet sht=book.getSheet("Sheet1");
			
			//Target row using sheet referral
			XSSFRow row=sht.getRow(1);
			
			//Using Row Target cell
			XSSFCell cell=row.getCell(0);
			
			//Read data from String cell
			String URL=cell.getStringCellValue();
			System.out.println(URL);
			
			
			/*
			 * 
			 * getStringCellValue:-->
			 * 			Method read characters from cell 
			 * getNumericCellValue:-->
			 * 			Method read number from cell and return in double format
			 * getDateCellValue:-->
			 * 			Method read data value from cell and return in Date format
			 * getBooleanvalue:-->
			 * 			Method read boolean value true/false from cell. 
			 */
			
	}

}
