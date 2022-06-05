import java.util.*;

class TreeSetDemo{
public static void main(String[] args)
{
	TreeSet t= new TreeSet();
	//t.add(null);till java 1.6 or before 1.7 null can be added only once in empty tree set but now it can not be done either way.
	t.add("Gaurav");
	t.add("Vidu");
	t.add("Rajat");
	t.add("Vaibhav");
	//t.add(null);Null pointer exception
	//t.add(new Integer(1)); heterogenous objects not allowed
	System.out.println(t);
	System.out.println(t.add("Gaurav"));
}
}