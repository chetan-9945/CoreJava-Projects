package com.exception.handle;


class ParentClass 
{
	public void loadingClass(String str) throws ClassNotFoundException
	{
	    Class.forName(str);
	    System.out.println("Class "+str+" loaded successfully.");
	}
}

class ChildClass extends ParentClass
{
	public void loadingClass(String str) throws ClassNotFoundException 
	{
		if(str == null || str.trim().isBlank())	
	  {
		try 
		{
		  throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Class not found - null");
		}
	  }
		else
		{
			super.loadingClass(str);
		}
	}
}


