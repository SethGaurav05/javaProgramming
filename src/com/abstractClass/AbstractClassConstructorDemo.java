//Write a program to show that an abstract class can have a constructor
//This program can also be used for Upcasting and Downcasting

abstract class MyAbstractClass
{
	protected final String name;

	public MyAbstractClass(String name)
	{
		this.name=name;
	}
	
	public abstract boolean start();
}

class Tomcat extends MyAbstractClass
{
	public Tomcat(String name)
	{
		super(name);
	}
	
	public boolean start()
	{
		System.out.println(this.name+" started successfully:)");
		return true;
	}
}

public class AbstractClassConstructorDemo
{
	public static void main(String[] args)
	{
		Tomcat t1= new Tomcat("Apache");
		t1.start();
		MyAbstractClass t2= new Tomcat("Tomcat");//Upcasting-casting child object to parent 
		t2.start();
		Tomcat t3= (Tomcat)t2;//Downcasting- casting of a parent object to child object
		t3.start();
		
	}
}