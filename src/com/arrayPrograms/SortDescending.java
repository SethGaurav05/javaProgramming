package com.arrayPrograms;

import java.util.Arrays;

public class SortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myarray = {12,5,6347,65,674,354,676};
		Arrays.sort(myarray);
		for(int index=myarray.length-1;index>=0;index--)
		{
			System.out.println(myarray[index]);
		}
		
	}

}
