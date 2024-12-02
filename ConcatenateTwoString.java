//3. Write a  JAVA program to concatenate two strings. 

import java.util.*;

public class ConcatenateTwoString
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the String ");
		String s=ab.nextLine();

		System.out.println("Enter the 2nd String ");
		String s1=ab.nextLine();
/*
		int lens=s.length();
		int lens1=s1.length();

		int lenA=lens+lens1;
		char a[]=new char[lenA];

		for(int i=0; i<s.length(); i++)
		{
				a[i]=s.charAt(i);
		}

		for(int i=s.length(), j=0; j<s1.length(); i++,j++)
		{
				a[i]=s1.charAt(j);
		}

		String cw String(a)h=ne;
		System.out.println(ch);

*/
		String a=s.concat(s1);
		System.out.println(a);
	}
}