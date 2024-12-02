/*
46. How to reverse words in a sentence without using a library method? 
Write a function, which takes a String word and returns sentence on which words are reversed in 
order like if the input is "Java is best programming language", the output should be "language 
programming best is Java". 
*/

import java.util.*;

public class Que46_ReverseStringNotWords
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
		System.out.println(str);

		int start=0;
		int end=0;

		char ch[]=str.toCharArray();

		for(int i=0; i<str.length(); i++)
		{
			if(i==str.length()-1 || ch[i]==' ')
			{
				end=i-1;
				if(i==str.length()-1)
				{
					end=i;
				}
				while(start<end)
				{
					char temp=ch[start];
					ch[start]=ch[end];
					ch[end]=temp;
					start++;
					end--;
				}
				start=i+1;
			}
		}
		String ss=new String (ch);
		System.out.println(ss);
	}
}