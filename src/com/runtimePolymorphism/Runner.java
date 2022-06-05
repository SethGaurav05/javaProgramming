package com.runtimePolymorphism;

public class Runner{	
	public static void main(String[] args) {
		RunTimePolymorphism obj1= new RunTimePolymorphism();
		System.out.println(obj1.x);
		obj1.ClassMethod();
		SubClass1 obj2= new SubClass1();
		System.out.println(obj2.x);
		obj2.ClassMethod();
		obj1=obj2;
		System.out.println(obj1.x);
		obj1.ClassMethod();
		
		RunTimePolymorphism obj3= new SubClass1();
		System.out.println(obj3.x);
		
		obj3.ClassMethod();
		
		
	}
}
