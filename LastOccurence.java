//15.Write a  JAVA program to find last occurrence of a character in a given string. 

import java.util.*;

public class LastOccurence
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=ab.nextLine();

		System.out.println("Enter the character ");
		char ch=ab.nextLine().charAt(0);


		int index=-1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				index=i;
			}
		}
		
		if(index!=-1)
		{
			System.out.println("Last Occurrence of String is at the index : "+index );
		}
		else
		{
			System.out.println("Character Not Found ");
		}
	}
}
