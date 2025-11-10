package com.comparable_comparator;

public record Trainer(int id,String name,double salary,double experience) implements Comparable<Trainer>
{
	@Override
	public int compareTo(Trainer o)
	{
//		return (int) (o.experience - this.experience);
		return this.name.compareTo(o.name);
	}
}
