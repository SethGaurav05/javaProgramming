package com.stringPrograms;

//import java.io.Console;
import java.util.*;

public class StringReverse {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
	System.out.println("Enter any String:");
	String data= sc.next();
	//String data="Gaurav";
	
	char[] dataArray=data.toCharArray();
	
	String result="";
	for(int index=dataArray.length-1; index>=0;index--)
	{
		result+=dataArray[index];
		
	}
	System.out.println("Reverse of "+ data+" is "+result);
	if(result.equalsIgnoreCase(data))
		System.out.println(data+" is a palindrome string");
	else
		System.out.println(data+" is not a palindrome string");
}
}
