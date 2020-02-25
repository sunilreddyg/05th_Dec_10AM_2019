package framework.Datadrivern.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.function.DoubleToLongFunction;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_CellData_From_Numeric_Cell {

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Access Workbook using fileinputstream loation
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook accesed");
		
		//Using book reference target sheet
		XSSFSheet sht=book.getSheetAt(0);
		
		//Target row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Target numeric cell and read numeric data from cell
		Double pwd_in_Dble_Frmt=row.getCell(2).getNumericCellValue();
		System.out.println("Pwd in double format is => "+pwd_in_Dble_Frmt);
		
		//Convert double format into integer
		int Pwd_int_Frmt=pwd_in_Dble_Frmt.intValue();
		System.out.println("password in integer format is => "+Pwd_int_Frmt);
		
		//Target mobile number cell and read value
		Double mobile_in_Dble_frmat=row.getCell(3).getNumericCellValue();
		System.out.println("Mobile number in double format is => "+mobile_in_Dble_frmat);
		
		//Covert mobile number from double format to long format
		long mobile_in_long_frmt=mobile_in_Dble_frmat.longValue();
		System.out.println("Mobile number in long format is => "+mobile_in_long_frmt);
		
		//Get double value from cell
		Double price=row.getCell(4).getNumericCellValue();
		System.out.println("price in double format is => "+price);
		
		
		//Convert double format value into string.
		String Mobile_in_text_Frmt=NumberToTextConverter.toText(mobile_in_Dble_frmat);
		System.out.println("Mobile number in txt format is => "+Mobile_in_text_Frmt);
		
		
		
		/*
		 * How to Convert Numrice cell into String cell 
		 * 		=> add numerice value before single code characters  '9030248855
		 * 		=> single code characters convert cell from numeric to string..
		 */
		String Alternate_Mobile=row.getCell(5).getStringCellValue();
		System.out.println("Mobile number in string format => "+Alternate_Mobile);
		
		
		
		//Read boolean value from cell
		boolean Flag=row.getCell(6).getBooleanCellValue();
		System.out.println("boolean value is => "+Flag);
		
		//Read Date cell value
		String date=row.getCell(7).getStringCellValue();
		System.out.println(date.toString());
		
	}

}
