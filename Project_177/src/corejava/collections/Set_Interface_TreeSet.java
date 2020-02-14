package corejava.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface_TreeSet {

	public static void main(String[] args) {
		
		Set<String> set=new TreeSet<>();
		set.add("object1");
		set.add("object2");
		set.add("object3");
		set.add("object4");
		set.add("object5");
		set.add("object1");
		
		//Get collection of objects count
		int count=set.size();
		System.out.println("object count is => "+count);
		
		//Remove object from collection
		set.remove("object3");
		
		//Verify object contain at collection
		boolean flag=set.contains("object3");
		System.out.println("object status is =>  "+flag);
		
		//Get First iterator value from collection of objects
		String itr=set.iterator().next();
		System.out.println("first iterator value is => "+itr);
		
	
		
		//Verify Collection empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection empty status is => "+flag1);
		
		
		//Print all collection of objects using foreach..
		for (String eachobject : set) 
		{
			System.out.println(eachobject);
		}
		
		
		
		//Get all object using while loop
		//Convert all collectin of objects into iterators
		Iterator<String> iterator=set.iterator();
		//Condition accept when iterator has next value 
		while(iterator.hasNext())
		{
			//Read each iterator value using next keyword...
			String eachobj=iterator.next();
			System.out.println(eachobj);
		}
		
		
		//Clear all objects at runtime
		set.clear();
				
		

	}

}
