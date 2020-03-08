package framework.Datadrivern.NotepadFiles;

import java.util.Scanner;

public class Scanner_Read_Data_From_System {

	public static void main(String[] args) 
	{
		
		//Create object for Scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your email:--> ");
		String Email=sc.next();
		System.out.println("Runtime email is  "+Email);
	
		System.out.println("Enter Your name:-->");
		String Name=sc.next();
		System.out.println("Username is => "+Name);
		
		System.out.println("Enter ID number:--> ");
		int UID=sc.nextInt();
		System.out.println("User ID is :--> "+UID);
		
		System.out.println("Start iteration number:--> ");
		int start=sc.nextInt();
		System.out.println("End iteration number:--> ");
		int End=sc.nextInt();
		
		for (int i = start; i <= End; i++) 
		{
			System.out.println(i);
		}
		

	}

}
