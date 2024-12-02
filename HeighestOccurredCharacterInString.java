/*
49. How to return highest occurred character in a String? 
You need to write a function to implement an algorithm which will accept a string of characters and 
should find the highest occurrence of the character and display it. For example if input is 
"aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a". 
*/

import java.util.*;

public class HeighestOccurredCharacterInString
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		int count=0;
		int hcount=0;
		int index=-1;
		for(int i=0; i<s.length(); i++)
		{
			count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>hcount)
			{
				hcount=count;
				index=i;
			}
		}

		System.out.println(s.charAt(index)+" is Highest Character "+hcount+" times ");
	}
}