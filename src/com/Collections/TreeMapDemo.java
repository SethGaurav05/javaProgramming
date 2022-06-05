import java.util.*;
class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap t= new TreeMap();
		t.put(1,"gaurav");
		t.put(10,"vidu");
		t.put(5,"rajat");
		t.put(6,6);
		//t.put("vaibhav","rajat");heterogenous objects and will get runtime exception stated get class cast exception
		//t.put(null,"seth");will get runtime exception stated get null pointer exception
		System.out.println(t);
		
		TreeMap t1= new TreeMap(new MyComparator());
		t1.put("XXX",10);
		t1.put("ZZZ",15);
		t1.put("AAA",16);
		t1.put("DDD",30);
		System.out.println(t1);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=obj1.toString();
		String s2= obj2.toString();
		return s2.compareTo(s1);
	}
}