import java.util.*;
class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet h= new LinkedHashSet();
		h.add("Gaurav");
		h.add("Vidu");
		h.add("Seth");
		h.add("Paliwal");
		h.add("Vaibhav");
		h.add("Rajat");
		h.add("05");
		h.add(null);
		System.out.println(h);		
		System.out.println(h.add("Gaurav"));
		System.out.println(h);
		List l= new ArrayList();
		l.add(h);
		System.out.println(l);
	}
}