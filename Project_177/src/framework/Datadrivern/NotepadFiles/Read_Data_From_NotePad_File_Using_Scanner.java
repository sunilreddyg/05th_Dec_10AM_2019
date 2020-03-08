package framework.Datadrivern.NotepadFiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_From_NotePad_File_Using_Scanner {

	public static void main(String[] args) throws IOException
	{

		String filepath="src\\\\framework\\\\Datadrivern\\\\NotepadFiles\\\\InputData.txt";
		//Read flat file
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
	
		//Create object for scanner
		Scanner sc=new Scanner(fr);
		
		//Read data using scanner
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			
			//Split delimeted value from line
			String data[]=line.split(",");
			System.out.println(data[0]+"  "+data[1]);
		}

	}

}
