package framework.Datadrivern.Excel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_Excel_File_Location {

	public static void main(String[] args) throws IOException 
	{
		
		//Target excel file location at system..
		File file=new File("TestData\\InputData.xlsx");
		
		/*
		 * To Read data from excel binary file we should target 
		 * file with fileinputStream class
		 */
		FileInputStream fi=new FileInputStream(file);
		System.out.println("file locatored");
		
		//Get Workbook access using above fileinputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("workbook accessed");
		
		//target sheet using workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		System.out.println("Sheet located");
		
		
		
		

	}

}
