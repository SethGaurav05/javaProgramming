package com.abstractClass;

public abstract class Runner  {
	static TestAbstractClass abc= new TestAbstractClass() {
		
		@Override
		public void AbstractMethod() {
			// TODO Auto-generated method stub
			System.out.println("i am from anonymous inner type");
			
		}
		
	};
	

	public static void main(String[] args) {
		
		abc.NonAbstractMethod();
		abc.AbstractMethod();
		
	}
}
