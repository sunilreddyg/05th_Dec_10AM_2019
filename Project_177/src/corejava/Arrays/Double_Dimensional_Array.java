package corejava.Arrays;

public class Double_Dimensional_Array
{

	public static void main(String[] args)
	{
		
		/*
		 * Double dimensional array store data into tabular format.
		 */
		
		
	
		/*
		 * Static Double dimensional Array:-->
		 */
		String data[][]=new String[3][2];
		
		//1s Row data
		data[0][0]="Arun";
		data[0][1]="25";
		
		//2nd Row data
		data[1][0]="krishna";
		data[1][1]="26";
		
		//3rd Row data
		data[2][0]="Raj";
		data[2][1]="29";
		
		System.out.println("2nd row and firstcell value is => "+data[2][1]);
		
				
		
		/*
		 * Runtime-double-dimensional-array:-->
		 */
		String userlist[][]={
								{"user1","9030248855"},
								{"user2","9030848855"},
								{"user3","9040885544"},
								{"user4","9040885533"},
							};
		
		System.out.println("Firstrow and zero cell data==> "+userlist[1][0]);
		
		
		
		
		//Mixed values to store.
		Object obj[][]=
			{
					{"user1",100},
					{"user2",200},
					{"user3",300},
			};
		
		System.out.println("Firstrow and zero index number is "+obj[1][0]);
		System.out.println("Firstrow and first index number is "+obj[1][1]);
		
		
		/*
		 * length:-->
		 * 			Length is a array method it returbn object count
		 * 			under array using integer format.. 
		 * It return list of object count under array.
		 */
		int len=obj.length;
		System.out.println("length of object is => "+len);
		
		
		
		
		
		
	}

}
