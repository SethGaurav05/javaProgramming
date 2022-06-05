import java.util.*;
class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		PriorityQueue q= new PriorityQueue();
		System.out.println(q.peek());// this will return null
		//System.out.println(q.element());//it will return no such element exception
		for(int i=0; i<10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);// 0,1,2,3,4,..,9
		System.out.println(q.poll());//output 0
		System.out.println(q);//this will give random output. some platforms not provide proper support for thread priorities. so out is same 1,2,3,4,..,9
		
		PriorityQueue q1= new PriorityQueue(15, new MyComparator());
		q1.offer("A");
		q1.offer("Z");
		q1.offer("L");
		q1.offer("B");
		System.out.println(q1);
		
	}
	
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		return s2.compareTo(s1);
	}
}