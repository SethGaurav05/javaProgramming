package com.logicBuilder;

public class LargestofThreeNumbers {
	public static void main(String[] args) {
		int number1 = -90;
		int number2 = -50;
		int number3 = 20;
		if(number1>number2)
		{
			if(number1>number3)
			{
				System.out.println(number1+" is largest");
			}
		}
		else if(number2>number3)
		{
			System.out.println(number2+" is largest");
		}
		else
			System.out.println(number3+" is largest");
	}
}
