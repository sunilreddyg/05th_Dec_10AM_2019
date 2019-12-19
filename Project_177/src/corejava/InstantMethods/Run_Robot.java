package corejava.InstantMethods;

public class Run_Robot {

	public static void main(String[] args)
	{
		
		/*
		 * Calling Instant Methods from other public class
		 * 	Syntax;-->
		 * 				ClassName obj=new Classname();
		 * 				obj.methodname();
		 */
		Robot obj=new Robot();
		obj.Run();
		obj.walk();
	

	}

}
