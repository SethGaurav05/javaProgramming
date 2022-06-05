import java.util.*;
class StackDemo{
	public static void main(String[] args)
	{
		Stack s= new Stack();
		s.push("C");
		s.push("B");
		s.push("A");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.peek();
		System.out.println(s);
		s.push("D");
		s.push("E");
		s.push("F");
		s.push("G");
		System.out.println(s);
		int x= s.search("B");
		System.out.println("seached on "+x);
		x= s.search("G");
		System.out.println("seached on "+x);
		x= s.search("H");
		System.out.println("seached on "+x);
		s.empty();
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s);
	}
}