package other_package;

import corejava.InstantMethods.Robot;
import corejava.StaticMethods.Native_Inputs;

public class Calling_Method_From_Diff_packages {

	public static void main(String[] args)
	{
		
		/*
		 * Note:--> Inorder to call other package
		 * 			methods or varaibles we shuold
		 * 			import package references to 
		 * 			current class.
		 */
		Robot obj=new Robot();
		obj.walk();
		obj.Run();
		
		
		Native_Inputs.Keybaord();
		Native_Inputs.mouse();
		
		
		
		

	}

}
