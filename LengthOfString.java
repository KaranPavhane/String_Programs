//1. Write a  JAVA program to find length of a string. 

import java.util.*;

public class LengthOfString
{
		public static void main(String x[])
		{
			Scanner ab=new Scanner(System.in);
		
			System.out.println("Enter the String ");
			String s=ab.nextLine();
/*
			int i=s.length();
			System.out.println("Length of String is : "+i);
*/

			int count=0;
		//	String s;
			try
			{
				for(int i=0; ; i++)
				{
					s.charAt(i);
					count++;
				}
			}
			catch (IndexOutOfBoundsException ex)
			{
				System.out.println("Length of array  "+count);
			}
		}
}