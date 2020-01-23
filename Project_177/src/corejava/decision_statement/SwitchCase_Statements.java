package corejava.decision_statement;

public class SwitchCase_Statements {

	public static void main(String[] args)
	{
		
		/*
		 * Switch-case:-->
		 * 		=> switch execute multiple decisions same
		 * 			as else if. only diff switch execute
		 * 			only selected case instead verifing
		 * 			everfy case. 
		 */		
		String month="feb";
		
		switch (month) 
		
		{
		case "jan":
				System.out.println("jan executed");
			break;
			
		case "feb":
			System.out.println("feb executed");
			break;
		
		case "mar":
			System.out.println("mar executed");
			break;

		default: System.out.println("month name mismatch");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
