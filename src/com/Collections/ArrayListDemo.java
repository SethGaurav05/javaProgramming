import java.util.*;

class ArrayListDemo{
	public static void main(String[] args){
	ArrayList l= new ArrayList();
	l.add("A");
	l.add("10");
	l.add(null);
	l.add("A");
	System.out.println(l);
	
	TreeSet s= new TreeSet();
	s.add("A");
	s.add("10");
	s.add("A");
	s.add("B");
	System.out.println(s);
	}
}