package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Dynamic_Row_Data {

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access Workbook using fileinputstream loation
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook accesed");
		
		//Using book reference target sheet
		XSSFSheet sht=book.getSheetAt(2);
		
		//Get Number of rows data count with in sheet
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows data available is => "+Rcount);
		
		//Iteate for number of rows data
		for (int i = 5; i <= Rcount; i++) 
		{	
			//Target Each row in sheet and read cell data
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"    "+PWD);
			
		}
		
		
		
		//Row and Cell Count Methods
		int LRow_Num=sht.getLastRowNum();  //Return last row data count
		int FRow_num=sht.getFirstRowNum(); //Return first row data count.
		
		System.out.println("In Excel Data starts at  => "+FRow_num);
		System.out.println("In Excel Data Ends at  => "+LRow_Num);
		
		//To get Cell count data,  first we need target requried row
		int Lcell_num=sht.getRow(5).getLastCellNum();   //Return first cell data count
		int Fcell_num=sht.getRow(5).getFirstCellNum();  //Return last cell data count.
		
		System.out.println("Start cell data number is => "+Fcell_num);
		System.out.println("Last cell data number is => "+Lcell_num);

	}

}
