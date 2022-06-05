//Write a program to insert String and StringBuffer objects into TreeSet where sorting order is increasing length order and if two object having the same length then consider the alphabetical order.

import java.util.*;
class TreeSetDemo1
{
	public static void main(String[] args)
	{
		TreeSet t1= new TreeSet(new MyComparator());
		t1.add("Q");
		t1.add("A");
		t1.add(new StringBuffer("ABC"));
		t1.add("AA");
		t1.add(new StringBuffer("AAA"));
		t1.add("AAB");
		t1.add(new StringBuffer("ABC"));
		t1.add("XX");
		System.out.println(t1);
		
		
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		int i1= str1.length();
		int i2= str2.length();
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return str1.compareTo(str2);
	}
}
