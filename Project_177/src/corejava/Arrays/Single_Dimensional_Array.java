package corejava.Arrays;

public class Single_Dimensional_Array 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Arrays:-->
		 * 		Arrays are list of variables which we
		 * 		refer to store into single reference variable.
		 * 		
		 * 		=> Array accept only similar values to store.
		 * 
		 * 		1. Static Array
		 * 		2. Runtime Array
		 */
		
		/*
		 * 1. Static Array:-->
		 * 			=> Static Array contains fixed boundaries.
		 * 			=> During static array declaration time, Programmer
		 * 				should declare fixed boundaries and then store
		 * 				values to array w.r.t fixed range.
		 */
		
		//Variable declaration
		String variable="WebDriver";
		System.out.println("Variable value is => "+variable);
		
		//array declaration
		String arr[]=new String[3];
		arr[0]="firefox";
		arr[1]="chrome";
		arr[2]="safari";
		
		System.out.println("Second index value is => "+arr[1]);
		
		
		
		
		/*
		 * Runtime Array:-->
		 * 			=> During this array programmer store set of
		 * 				value without defining any boundaries.
		 * 			
		 */
		
		//List of values to store into single variable
		String tools[]= {"IDE","RC","GRID","WD"};
		System.out.println("3rd index value is => "+tools[3]);
		
		//Get Object count
		int Count=tools.length;
		System.out.println("Object count is => "+Count);
		

	}

}
