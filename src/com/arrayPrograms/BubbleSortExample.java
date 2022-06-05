package com.arrayPrograms;

public class BubbleSortExample {
	public static void main(String[] args) {
		int data[] = { 25, 80, 45, 13, 13, 89, -4 ,10};
		for (int d : data) {
			System.out.print(d + "\t");
		}
		System.out.println("");
		int temp;

		for (int index = 0; index < data.length - 1; index++) { // passes
			for (int element = 0; element < data.length - 1; element++) {
				temp = data[element];
				if (data[element] > data[element + 1]) {
					// swapping
					data[element] = data[element + 1];
					data[element + 1] = temp;
				}
			}
			for (int j = 0; j < data.length; j++) {
				System.out.print(data[j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		/*
		 * for (int d : data) System.out.print(d + "\t");
		 */

	}
}
