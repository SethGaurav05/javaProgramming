import java.util.*;
class IdentityHashMapDemo
{
	public static void main(String[] args)
	{
		HashMap m= new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1,"Gaurav");
		m.put(i2,"Rajat");
		System.out.println(m);
		
		IdentityHashMap lm = new IdentityHashMap();
		Integer i3=new Integer(10);
		Integer i4=new Integer(10);
		lm.put(i3,"Gaurav");
		lm.put(i4,"Rajat");
		System.out.println(lm);
		
	}

}