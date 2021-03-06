package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Treeset {
	public static void main(String ar[])
	{
		
		
        Set<String> tree_Set = new TreeSet(); 
        tree_Set.add("Zebra"); 
        tree_Set.add("Lion"); 
        tree_Set.add("Ant"); 
        tree_Set.add("Elephant"); 
        tree_Set.add("Tiger"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(tree_Set); 
		
	// Using Treeset you can get sorted unique data. Input order not maintained.
		
		System.out.println("List using for loop ");
		System.out.println("");
		
	// using Iterator
		System.out.println("");
		System.out.println("List using Iterator ");
		System.out.println("");
		
		Iterator iterator=tree_Set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
