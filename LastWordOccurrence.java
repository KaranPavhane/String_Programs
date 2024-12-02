//30.Write a JAVA program to find last occurrence of a word in a given string. 

import java.util.*;

public class LastWordOccurrence
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the String ");
		String str=ab.nextLine();


		String s[]=str.split(" ");
		System.out.println("Enter the Word to find in last occurrence ");
		String a=ab.nextLine();

		int index=-1;
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals(a))
			{
				index=i;
			}
		}

		if(index!=-1)
		{
			System.out.println(a+" is present in last Occurrence "+index);
		}
		else
		{
			System.out.println("Word not Present ");
		}
	}
}

