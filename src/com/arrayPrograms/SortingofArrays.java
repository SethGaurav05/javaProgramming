package com.arrayPrograms;

import java.util.Arrays;

public class SortingofArrays {
	public static void main(String[] args) {
		String[] names = { "Gaurav", "Amit", "Rajat", "Veer" };
		int data[] = { 50, 5, 30, 2, -5, 36 };

		Arrays.sort(data);
		for (int d : data) {
			System.out.print(d + "\t");
		}
		System.out.println("");
		Arrays.sort(names);
		for (String d : names) {
			System.out.print(d + "\t");
		}
		
		
	}

}
