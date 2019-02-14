package com.collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set {
	public static void main(String ar[])
	{
		
		// Set takes unique contents only. Duplication not allowed, compile time error.
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set); 
		
	// Using Hash set we get Unique Data surety. but order of data not sure.
		
		System.out.println("List using for loop ");
		System.out.println("");
		
	// using Iterator
		System.out.println("");
		System.out.println("List using Iterator ");
		System.out.println("");
		
		Iterator iterator=hash_Set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
