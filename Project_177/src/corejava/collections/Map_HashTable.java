package corejava.collections;

import java.util.Hashtable;
import java.util.Set;

public class Map_HashTable {

	public static void main(String[] args) 
	{
		
		/*
		 * Map:-->
		 * 		Map is a interface class which store pair objects
		 * 		as collection. We store pair object using keyname
		 * 		and value.. 
		 * 
		 * 			=> Hashtable is sorter list of set..
		 * 			[Hashtable alos unorder collection of objects
		 * 				and doesn't accept duplicates...]
		 */
		
		
		Hashtable<Integer, String> map=new Hashtable<Integer,String>();
		map.put(1, "Arun");
		map.put(2, "Kishore");
		map.put(3, "Ravi");
		map.put(4, "sudheer");
		
		
		//Remove object
		map.remove(1);
		
		//Get value using keyname
		String val=map.get(2);
		System.out.println("2nd key value is => "+val);
		
		
		//Get All Keyset value..
		Set<Integer> set=map.keySet();
		//Apply foreach loop to iterate set object time
		for (Integer Eachkey : set) 
		{
			String EachValue=map.get(Eachkey);
			System.out.println(Eachkey+" => "+ EachValue);
		}
		
		
		
		
		
		
		
		
		
	}

}
