import java.util.*;
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
			if(i1<i2)
				return +1;
			else if(i1>i2)
				return -1;
			else
				return 0;
	}
}

class ComparatorDemo
{
	public static void main(String[] args)
	{
		TreeSet t= new TreeSet(new MyComparator());
		t.add(50);
		t.add(10);
		t.add(25);
		t.add(49);
		t.add(5);
		t.add(51);
		System.out.println(t);
	}
}