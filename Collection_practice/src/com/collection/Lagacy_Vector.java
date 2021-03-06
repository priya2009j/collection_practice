package com.collection;

import java.util.LinkedList;
import java.util.Vector;

public class Lagacy_Vector {

	public static void main(String args[]) 
    { 
        // Creating object of class Vector
        Vector object = new Vector(); 
  
        // Adding elements to the vector
        object.add("Abhay"); 
        object.add("Bali"); 
        object.add(2, "Eagel"); 
        object.add("Firoz"); 
        object.add("Golu"); 
        System.out.println("Vector : " + object); 
  
        // Removing elements from the Vector
        object.remove("B"); 
        object.remove(3); 
    
        System.out.println("Vecotr after deletion: " + object); 
  
        // Finding elements in the Vector
        boolean status = object.contains("E"); 
  
        if(status) 
            System.out.println("Vector the element 'E' "); 
        else
            System.out.println("Vector doesn't contain the element 'E'"); 
  
        // Number of elements in the Vector 
        int size = object.size(); 
        System.out.println("Size of Vector = " + size); 
  
        // Get and set elements from Vector
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Yati"); 
        System.out.println("Vector after change : " + object); 
    } 
}
