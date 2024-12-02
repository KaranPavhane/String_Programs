//39.Write a JAVA program to remove all extra blank spaces from given string. 

import java.util.*;

public class RemoveAllExtraBlankSpaces
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();

		int start=0;
		int end=0;

		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				start=i;
				break;
			}
		}

		for(int i=s.length()-1;i>=0; i--)
		{
			if(s.charAt(i)!=' ')
			{
				end=i;
				break;
			}
		}
       // String str=new String("");
		StringBuilder str=new StringBuilder();
		for(int i=start; i<=end; i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			else
			{
				str.append(s.charAt(i));
				//str=str+s.charAt(i);
			}
		}
/*
		for(int i=0; i<s.length(); i++)
		{
			str.append(s.charAt(i));
		}
*/
		System.out.println(str);
		System.out.println(str.length());
	}
}
