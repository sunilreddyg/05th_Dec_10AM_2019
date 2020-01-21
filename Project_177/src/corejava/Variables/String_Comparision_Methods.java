package corejava.Variables;


public class String_Comparision_Methods {

	public static void main(String[] args) 
	{
		
		/*
		 * String:->
		 * 			String is not only non-primitive datatype and also
		 * 			called as class.And String class contains set of
		 * 			methods to validate stored characters behaviour.
		 */
		
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 * 		Note:--> Comparision is case-sensitive.
		 */
		String act_result="Account Created Successfull";
		String exp_result="account created successfull";
		
		boolean flag=act_result.equals(exp_result);
		System.out.println("equal comparision status is => "+flag);
		
		
		/*
		 * EqualIgnoreCase:-->
		 * 			Method verify equal comparision by ignoring
		 * 			case-sensitive and return boolean value true/false
		 */
		boolean flag1=act_result.equalsIgnoreCase(exp_result);
		System.out.println("equalingore case comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		  Method verify partial character-sequences available
		 * 		  at main string, And return boolean value true/false.
		 */
		String Act="Account Created 100 successfull";
		String Exp="100";
		
		boolean flag2=Act.contains(Exp);
		System.out.println("Sub String available status is => "+flag2);
		
		
		/*
		 * SubString:-->
		 * 		Method get sub String from mainstring, And
		 * 		return value with in String format..
		 */
		String Act_num="111122223333";
		
		String Middle_chars=Act_num.substring(4, 8);
		System.out.println("Middle characters at string are => "+Middle_chars);
		
		//get last characters at account
		String Last_chars=Act_num.substring(8);
		System.out.println("Last characters at string are => "+Last_chars);
		
		
		/*
		 * length:-->
		 * 		method verify number of characters available at string
		 * 		and return integer value.
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Mobile length of characters are => "+len);
		
		
		/*
		 * trim:-->
		 * 		Method trim extra spaces at string, After trimming
		 * 		it return New String value without extra spaces..
		 */
		String toolname="     Webdriver   ";
		System.out.println("before trim characters length is => "+toolname.length());
		
		//trim extra spaces...
		String NewTool=toolname.trim();
		
		System.out.println("After trim characters length is => "+NewTool.length());
		
		
		
		/*
		 * StartsWith:-->
		 * 			Method verify given characters Starts with expected
		 * 			characters and return boolean value true/false.
		 */
		String IFSC_Code="HDFC00012";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("Starts with expected characters => "+flag3);
		
		
		/*
		 * Endswith:-->
		 * 			Method verify given characters Ends with expected
		 * 			characters and return boolean value true/false.
		 */
		String Code="00000100";
		boolean flag4=Code.endsWith("100");
		System.out.println("Ends with expected characers => "+flag4);
		
		
		/*
		 * ToUpperCase:-->
		 * 		Method convert all lowercase characters into uppercase
		 */
		String firstname="Arjun";
		String firstname_Caps=firstname.toUpperCase();
		System.out.println("Firstname in uppercase characters => "+firstname_Caps);
		
		
		/*
		 * ToLowerCase:-->
		 * 		Method convert all uppercase characters into lowsercase
		 */
		String lastname="KRishna";
		String lastname_smalls=lastname.toLowerCase();
		System.out.println("lastname in lowercase characters => "+lastname_smalls);
		
		
		/*
		 * isEmpty:-->
		 * 		Method returb boolean value true on String empty
		 * 		and return false when string conain characters..
		 */
		String var="";
		String var1="MQ";
		System.out.println("var empty status is => "+var.isEmpty());
		System.out.println("Var1 empty status is => "+var1.isEmpty());

	}

}
