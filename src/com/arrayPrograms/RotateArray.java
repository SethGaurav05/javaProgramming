package com.arrayPrograms;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArray[] = { 20, 30, 40, 50, 60 };
		for (int i : myArray) {
			System.out.print(i + "\t");
		}
		System.out.println("");		
		int count = 5;
		int temp;
		for (int i = 0; i < count; i++) {
			temp = myArray[0];
			for (int index = 0; index < myArray.length - 1; index++) {
				myArray[index] = myArray[index + 1];
				
			}
			myArray[myArray.length - 1] = temp;
			for(int j=0;j<myArray.length;j++)
			{
				System.out.print(myArray[j] + "\t");
			}
			System.out.println("");
		}
		
		
	}

}
