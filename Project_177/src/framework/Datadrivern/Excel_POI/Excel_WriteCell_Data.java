package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteCell_Data {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using sheetname
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Write data into Existing row and Existing cell
		sht.getRow(1).getCell(2).setCellValue("NewPwd1234");
		
		//Write cell data into Existing row and New Cell
		sht.getRow(1).createCell(8).setCellValue("Testpass");
		
		//Write cell data into New Row and New Cell
		sht.createRow(2).createCell(0).setCellValue("http://facebook.com");

		//Write entire book into output file.
		book.write(new FileOutputStream("TestData\\OP.xlsx"));
		book.close();  //Write and Save Data
		
		
		
	}

}
