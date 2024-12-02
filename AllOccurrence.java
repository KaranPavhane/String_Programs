//16.Write a  JAVA program to search all occurrences of a character in given string. 

import java.util.*;

public class AllOccurrence 
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the String ");
		String s=ab.nextLine();

		for(int i=0; i<s.length(); i++)
		{
			System.out.printf("%d----->%c\n",i,s.charAt(i));
		}
		ab.close();
	}
}