package com.array.demo;

public record Course(Integer id,String name,Double fee) 
{

	@Override
	public String toString() {
		return id + "  : " + name + "\t:" + fee;
	}
	
}
