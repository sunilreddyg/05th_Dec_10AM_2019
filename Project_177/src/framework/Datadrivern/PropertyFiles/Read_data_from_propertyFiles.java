package framework.Datadrivern.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_data_from_propertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		//Target Fileinput
		String filepath="src\\framework\\Datadrivern\\PropertyFiles\\Input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Create object for Properties
		Properties repository=new Properties();
		//Load input file repository..
		repository.load(fi);
		
		//get value using keyname
		String Pageurl=repository.getProperty("facebook.url");
		System.out.println(Pageurl);
		
		//Read Username from property files
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
	}

}
