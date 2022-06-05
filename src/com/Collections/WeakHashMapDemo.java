//program for weakhashmap
//the main concept for weak hashmap is Garbage collector which can destrop object of weak hashmap and can call finalize method. This is the main difference in weakhash map and hashmap. Garbage Collector can not destroy the object of hashmap and we can see that below while creating the object of hashmap instead of weak hashmap


import java.util.*;
class WeakHashMapDemo
{
	public static void main(String[] args) throws Exception
	{
		WeakHashMap wm= new WeakHashMap();//try here HashMap and not WeakHashMap and observe the output
		Temp t= new Temp();
		wm.put(t,"Gaurav");
		System.out.println(wm);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wm);
	}
}

class Temp
{
	public String toString()
	{
		return "temp";
	}
	
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}