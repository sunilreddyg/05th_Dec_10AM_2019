package framework.Datadrivern.CSV_Files;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_data_from_Csvfiles {

	public static void main(String[] args) throws IOException 
	{
	
		//Target file location
		String filepath="src\\framework\\Datadrivern\\CSV_Files\\input.csv";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object for CSVReader class
		CSVReader reader=new CSVReader(fr);
		
		//CsvFile Allow Each Record reading using ReadNext Method
		String Rec1[]=reader.readNext();
		System.out.println(Rec1[0]+"    "+Rec1[1]);
		
		String Rec2[]=reader.readNext();
		System.out.println(Rec2[0]+"    "+Rec2[1]);
		
		
		String Records[];
		//Iterate untile file has next records
		while((Records=reader.readNext())!=null)
		{
			System.out.println(Records[0]+"   "+Records[1]);
		}
		
		
		
		
	}

}
