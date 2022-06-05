import java.util.*;
class ListIteratorDemo{
	public static void main(String[] args)
	{
		LinkedList l= new LinkedList();
		l.add("Gaurav");
		l.add("Seth");
		l.add("Vidu");
		l.add("Paliwal");
		System.out.println(l);
		ListIterator ltr= l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Seth"))
				ltr.remove();
			else if(s.equals("Gaurav"))  
				ltr.add("Rajat");
			else if(s.equals("Paliwal"))
				ltr.set("Vaibhav");
		}
		System.out.println(l);
	}
}