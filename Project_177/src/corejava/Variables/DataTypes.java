package corejava.Variables;

public class DataTypes {

	public static void main(String[] args) 
	{


		/*
		 * Datatypes:-->
		 * 			Alocate memory to varaibles.
		 * 				[Range of value OR type of value]
		 */
		
		
		/*
		 * byte:-->
		 * 			Byte is a interger datatype
		 * 			Default return value is  0
		 * 			max value to allow is  127
		 * 			min value is -128
		 */
		byte a=127;
		System.out.println("byte value is "+a);
		
		
		
		/*
		 * int:--> 
		 * 		 Int is a numeric datatype
		 * 		 Default value is 0
		 * 		 
		 * 		Note:--> Always follow int datatype to 
		 * 				store numbers...
		 */
		int b=100000;
		int c=300000;
		int d=b+c;
		System.out.println("total value is => "+d);
		System.out.println("total value is => "+(b+c));
		
		 
		/*
		 * boolean:-->
		 * 			Datatype accept only true/false..
		 * 			default value is false.
		 */
		boolean flag=true;
		System.out.println("Flag value is => "+flag);
		
		boolean flag1=false;
		System.out.println("flag1 value is => "+flag1);
		
		
		/*
		 * double;-->
		 * 			Accept decimal values to store
		 * 			Default value is 0
		 * 			Accept upto 8 significant decimals
		 */
		double ver=3.14012;
		System.out.println("Decimal value is => "+ver);
		
		double price=1200.75;
		System.out.println("product price is =. "+price);
		
		
		
		/*
		 * char:--> 
		 * 		Accept single character to store
		 * 		
		 */
		char first='A';
		char second='B';
		char third='C';
		
		System.out.println(first+"   "+second+"  "+third);
		
		
		
		/*
		 * String:-->
		 * 		 String store set of characters.
		 * 		 default value is null..
		 */
		String name="mq-dsnr";
		String email="info.dsnr@gmail.com";
		String mobile="9030248855";
		
		System.out.println(name+"   "+email+"   "+mobile);

	}

}
