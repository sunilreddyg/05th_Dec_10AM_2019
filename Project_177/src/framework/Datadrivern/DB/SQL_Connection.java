package framework.Datadrivern.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_Connection 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		//Set Variable name
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		//Connectin Details
		String DB_system="jdbc:sqlserver://localhost:";
		String DB_name="MQ-DSNR:";
		String Username="Admin:";
		String password="Admin:";
		
		
		Connection con=DriverManager.getConnection(DB_system+DB_name+Username+password);
		if(con!=null)
		{
			System.out.println("Database Connected");
			//This statement execute query at runtime and store all database records into Resultset Reference
			ResultSet res=con.createStatement().executeQuery("SELECT * FROM Students;");
			
			
			//Write Condition loop to read all database records
			while(res.next())
			{
				//Get Datase Records USing FieldName
				String SID=res.getString("StudentID");
				String Cname=res.getString("ContantName");
				String Mobile=res.getString("Mobile");
				String email=res.getString("Email");
				String Course_Details=res.getString("CourseTitle");
			}
	
			
		}
		else
			System.out.println("Database connection failed");

	    
	}

}
