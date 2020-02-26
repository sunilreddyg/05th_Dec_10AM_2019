package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Get_Numeric_And_String_CellData_From_DynamicRows {

	public static void main(String[] args) throws Exception 
	{
		//target file location using FileinputStream
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook using fileinputstream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet access using workbook
		XSSFSheet sht=book.getSheet("Sheet6");
		
		//Get Number of rows data count
		int Rcount=sht.getLastRowNum();
		
		//Iterate for number of rows
		for (int i = 0; i <= Rcount; i++) 
		{
			 XSSFCell UID_cell=sht.getRow(i).getCell(0);
			 XSSFCell PWD_cell=sht.getRow(i).getCell(1);
			 
			 String Username = null;
			 if(UID_cell.getCellType()==Cell.CELL_TYPE_STRING)
			 {
				  Username=UID_cell.getStringCellValue();
			 }
			 else if(UID_cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			 {
				 Double DoubleCell=UID_cell.getNumericCellValue();
				 Username=NumberToTextConverter.toText(DoubleCell);
			 }
			 
			 System.out.println(Username);
			 
		
		}
		
		
	
	}

}
