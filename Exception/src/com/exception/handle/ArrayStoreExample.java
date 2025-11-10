package com.exception.handle;

public class ArrayStoreExample 
{
	public static void main(String[] args) 
	{
		try {
			storeObjects();
		}catch(ArrayStoreException e) {
			System.out.println("Array error");
		}
		
	}
	
	public static void storeObjects ()throws ArrayStoreException
	{
		
			int size = 5;
			
			Object arr[] = new String[size];
			arr[0]= "java";
			arr[1]= "world";
			arr[2]= 123;
			arr[3]= true;
			
			for(Object arrs : arr)
			{
				System.out.println("array is :"+arrs);
			}
		
	}

}
