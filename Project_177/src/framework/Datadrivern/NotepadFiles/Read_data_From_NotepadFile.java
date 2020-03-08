package framework.Datadrivern.NotepadFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_data_From_NotepadFile {

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		String filepath="src\\framework\\Datadrivern\\NotepadFiles\\InputData.txt";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object for BufferedReader.
		BufferedReader reader=new BufferedReader(fr);
		
		//Read Header line of notepad file
		String Header=reader.readLine();
		//Split Header text using , delimeted file
		String New_header[]=Header.split(",");
		System.out.println(New_header[0]+"     "+New_header[1]);
		
		//Condition to read data from notpad file
		String line;
		while((line=reader.readLine())!=null)
		{
			  String Rline[]=line.split(",");
			  System.out.println(Rline[0]+"     "+Rline[1]);
		}
		

	}

}
