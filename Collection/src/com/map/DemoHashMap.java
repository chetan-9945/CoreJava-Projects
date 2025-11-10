package com.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DemoHashMap {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> hash = new LinkedHashMap<>();
		
		hash.put(1, "chetan");
		hash.put(2,"Aditya");
		Collection<Entry<Integer, String>> keySet = hash.entrySet();
//		hash.put(3, null);
//			hash.getOrDefault(1, "chetan");
//			hash.computeIfAbsent(3, key-> "sakshi");
//			System.out.println(hash);
//			hash.computeIfPresent(null, null);
		Iterator<Entry<Integer, String>> itr = keySet.iterator();
//		String remove = hash.remove(2);
//		String string = hash.get(3);
//		System.out.println(hash.containsKey("aditya")+"   "+string);
		hash.merge(1, " manisha ", (v1,v2)-> v1+v2);
		itr.forEachRemaining(str -> System.out.println(str));
		
	}
}
