package com.Vector.fetchdataways;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorDemo
{
	public static void main(String[] args) 
	{
		Vector<Object> obj = new Vector<>();
		obj.add("12");
		obj.add(12);
		obj.add(12.50);
		obj.add("twelve");
		obj.add(new Vector<>());
		
		System.out.println(" Using to string :"+obj);
		System.out.println("----------------------------------------------");
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println("Using Ordanary for loop :"+obj.get(i));
		}
		
		System.out.println("----------------------------------------------");
		
		for(Object objs : obj)
		{
			System.out.println(" using For each loop :"+objs);
		}
		
		System.out.println("----------------------------------------------");
		
		Enumeration<Object> eNum = obj.elements();
	
/*		System.out.println("using Enumeration Interface.");
		while(Enum.hasMoreElements())
		{
			System.out.println(Enum.nextElement());
		}*/
		
		System.out.println("----------------------------------------------");
		System.out.println("using Itretor Interface.");
		
		Iterator<Object> itr = obj.iterator();
		
		Consumer<Object> cons = object -> System.out.println(object);
	
		itr.forEachRemaining(cons);
		System.out.println("----------------------------------------------");
		ListIterator<Object> Listitr = obj.listIterator();
		
		while(Listitr.hasNext())
		{
			System.out.println("Using the ListIterator :"+Listitr.next());
		}
		
	}
	
   
		
}
