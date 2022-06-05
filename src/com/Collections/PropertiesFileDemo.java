import java.util.*;
import java.io.*;
class PropertiesFileDemo
{
	public static void main(String[] args) throws Exception
	{
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("fname");
		System.out.println(s);
		p.setProperty("age","31");
		FileOutputStream fos= new FileOutputStream("abc.properties");
		p.store(fos,"Updated by Gaurav Seth");
		System.out.println(p);
	}
}