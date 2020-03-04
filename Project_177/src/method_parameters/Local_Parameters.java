package method_parameters;

public class Local_Parameters 
{
	//Method witout parameter
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	//Method with single parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
	}
	
	//Method with multiple parameter
	public void print_tool(String toolname, double price)
	{
		String name=toolname;
		System.out.println(name+"  ==>   "+price);
	}
	
	public void print_tool(double price, String toolname)
	{
		String name=toolname;
		System.out.println(name+"  ==>   "+price);
	}
	

	public static void main(String[] args) 
	{
		//Calling Class Object method witout argumet
		Local_Parameters obj=new Local_Parameters();
		obj.print_tool();
		obj.print_tool();
		
		//Calling method with arguments
		obj.print_tool("IDE");
		obj.print_tool("GRID");
		
		//calling method with multiple arguments
		obj.print_tool("IDE", 1000.00);
		obj.print_tool(2000.00, "GRID");

	}

}
