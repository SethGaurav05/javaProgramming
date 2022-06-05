//program for Hashtable
//default initial capacity of Hashtable is 11 for default constructor.
//in hashCode function,by default if value adding to table is greater than 11 then it will put the object to remainder value in the table. for example 13 when divided by 11 gives remainder 2. so value will be placed on 2nd index.
//in this way we can get the hashcode by ourself. Just remember Top to bottom and right to left hierarchy.


import java.util.*;
class HashTableDemo
{
	public static void main(String[] args)
	{
		Hashtable h= new Hashtable();
		h.put(new Temp(5),"A");
		h.put(new Temp(13), "B");
		h.put(new Temp(17), "C");
		h.put(new Temp(11), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(24), "F");
		//h.put(new Temp(27), null);null can't be inserted to Hashtable neither for key nor for value and will throw null pointer exception during runtime
		System.out.println(h);
	}
}

class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;// will give remainder when divided by 11. else we can explicity give our value like return i%9
	}
	
	public String toString()
	{
		return i+"";
	}
}