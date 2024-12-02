//14.Write a JAVA program to find first occurrence of a character in a given string. 

import java.util.*;

public class FirstOccurence
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=ab.nextLine();
		
		System.out.println("Enter the character ");
		char ch=ab.nextLine().charAt(0);
		
		int index=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				index=i;
				break;
			}
		}

		if(index!=0)
		{
			System.out.printf("First occurrence of String is at the Index : "+index);
		}
		else
		{
			System.out.println("Character not Found ");
		}



	}
}
