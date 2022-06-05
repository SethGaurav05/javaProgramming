//Write a program to count the duplicate characters from a string.
class CountDuplicateChar
{
	public static void main(String[] args)
	{
		String str1="Please find the count of all duplicate characters from this string";
		int count;
		
		char str[]=str1.toCharArray();
		
		System.out.println("Duplicate Characters are:");
		
		for(int i=0; i<str.length;i++)
		{
			count =1;
			for(int j=0; j<str.length;j++)
			{
				if(str[i]==str[j]&& str[i] != ' ')
				{
					count= count+1;
					str[j]='0';
				}
			}
			if(count>1 &&str[i]!='0')
			System.out.println("Count for " +str[i]+" is: "+count);
		}
		
	}
}