import java.util.*;

class VectorDemo{
public static void main(String[] args)
{
	Vector v= new Vector(15);
	System.out.println(v.capacity());
	for(int i=1;i<=v.capacity();i++)
	{
		v.add(i);
	}
	System.out.println(v.capacity());
	System.out.println(v);
	v.add("11");
	System.out.println(v.capacity());
	System.out.println(v);
}

}
