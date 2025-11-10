package com.labcoll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test
{
       public static void main(String[] args) 
       {
            List<String> list1 = new ArrayList<String>();
		list1.add("Dohni");
		list1.add("Sahwag");
		list1.add("Bumrah");
		list1.set(0, "Virat");
		list1.add(0, "Rohit");
		System.out.println(list1); 
       }
}