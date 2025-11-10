package demo;

import java.io.*;

class Super
{
	public void show()  throws FileNotFoundException, IOException
	{
		
	}
}

class Base extends Super 
{
	public void show() throws IOException
	{
		
	}
}

public class Demo
{
	public static void main(String[] args) 
	{
		Super sp = new Base();
	
	}
}