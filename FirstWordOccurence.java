//29.Write a JAVA program to find first occurrence of a word in a given string. 

import java.util.*;

public class FirstWordOccurence
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the String Array ");
		String str=ab.nextLine();
/* 
		String s[]=new String[8];

		for(int i=0; i<s.length; i++)
		{
			s[i]=ab.nextLine();
		}
*/
		System.out.println("Enter the Word to Find ");
		String a=ab.nextLine();
		int index=FindIndexOfWord(str,a);
		if(index!=-1){
			System.out.println("Word Present at Idex "+index);
		}
		else{
			System.out.println("Not present ");
		}
/* 
		int index=-1;
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals(a))
			{
				index=i;
				break;
			}
		}

		if(index!=-1)
		{
			System.out.println(a+" is Present At the Index : "+index);
		}
		else
		{
			System.out.println("Word not Present");
		}
*/
	}

	public static int FindIndexOfWord(String str,String word){


		return str.indexOf(word);
	}
}