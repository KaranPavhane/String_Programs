/*
47. How to check if String is Palindrome? 
Another easy coding question based upon String, I am sure you must have done this numerous time. 
Your program should return true if String is a Palindrome, otherwise false. For example, if the input 
is "radar", the output should be true, if the input is "madam" output will be true, and if the input 
is "Java" output should be false.
*/

import java.util.*;

public class CheckStringPalindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String ");
		String s=sc.nextLine();

		String str=new String();
		for(int i=0; i<s.length(); i++)
		{
			str=str+s.charAt(s.length()-1-i);
		}

		boolean flag=false;

		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==str.charAt(i))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}

		if(flag)
		{
			System.out.println("String is Palindrome ");
		}
		else
		{
			System.out.println("String is Not Palindrome ");
		}
		
	}
}