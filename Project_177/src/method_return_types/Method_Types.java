package method_return_types;


public class Method_Types 
{

	//Void is a method type And void method doesn't return any value
	public void method1()
	{
		String name="Selenium";
	}
	
	
	/*
	 * => Otherthan void for all method types we should
	 * 		write return keyword at end of the method
	 * => Return value should match with method type
	 * => At finally value return to method name
	 */
	public String method2()
	{
		String name="WebDriver";
		return name;
	}
	
	public static void main(String[] args) {
		
		
		//Calling void method
		Method_Types obj=new Method_Types();
		obj.method1();
		
		//Calling method with return type
		String Toolname=obj.method2();
		System.out.println(Toolname);

	}

}
