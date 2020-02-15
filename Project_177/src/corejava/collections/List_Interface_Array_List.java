package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface_Array_List {

	public static void main(String[] args)
	{
	
		List<String> list=new ArrayList<>();
		list.add("object1");
		list.add("object2");
		list.add("object3");
		list.add("object4");
		list.add("object5");
		list.add("object1");
		
		//Get collection of objects count
		int count=list.size();
		System.out.println("object count is => "+count);
		
		//Remove object from collection
		list.remove("object3");
		
		//Verify object contain at collection
		boolean flag=list.contains("object3");
		System.out.println("object status is =>  "+flag);
		
		//Get First iterator value from collection of objects
		String itr=list.iterator().next();
		System.out.println("first iterator value is => "+itr);
		
		//Verify Collection empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection empty status is => "+flag1);
		
		
		//find any single object using index number..
		//[We can access object using index in list interface only]
		String obj3=list.get(3);
		System.out.println("object ar 3rd index is => "+obj3);
		
		
		//Using for loop get all object [List interface only accept for-loop to get all objects]
		for (int i = 0; i < list.size(); i++) 
		{
			String index_object=list.get(i);
			System.out.println(i+". "+index_object);
		}
		
		

		
		//Print all collection of objects using foreach..
		for (String Eachobject : list) 
		{
			System.out.println(Eachobject);
		}
		
		
		
		//Get all object using while loop
		//Convert all collectin of objects into iterators
		Iterator<String> iterator=list.iterator();
		//Condition accept when iterator has next value 
		while(iterator.hasNext())
		{
			//Read each iterator value using next keyword...
			String eachobj=iterator.next();
			System.out.println(eachobj);
		}
		
		
		//Clear all objects at runtime
		list.clear();
	}

}
