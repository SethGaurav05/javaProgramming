import java.util.*;
class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("gaurav",05);
		m.put("vidu",21);
		m.put("rajat",12);
		System.out.println(m);
		System.out.println(m.put("gaurav",10));
		System.out.println(m);
		Set s= m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next() ;
			System.out.println(m1.getKey()+"....."+m1.getValue());
			if(m1.getKey().equals("gaurav"))
				m1.setValue(10000);
		}
	}
} 