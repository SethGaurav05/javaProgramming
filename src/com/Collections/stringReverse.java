class stringReverse{

public static void main(String args[])
{
	String myString = "Java";
	char[] myCharArray= myString.toCharArray();
	for(int i=myCharArray.length-1; i>=0; i--)
	System.out.print(myCharArray[i]);
}
}