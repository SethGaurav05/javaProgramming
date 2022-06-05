import java.util.*;
class LinkedListDemo{
public static void main(String[] args){
	LinkedList l= new LinkedList();
	l.add("gaurav");
	l.add(null);
	l.add(30);
	l.add("gaurav");
	System.out.println(l);
	l.set(0,"gaurav seth");
	System.out.println(l);
	l.add(0,"vidu");
	System.out.println(l);
	l.removeLast();
	System.out.println(l);
	l.addFirst("gaurav");
	System.out.println(l);
}
}