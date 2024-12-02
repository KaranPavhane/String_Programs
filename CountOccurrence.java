//17.Write a JAVA program to count occurrences of a character in given string. 

import java.util.*;

public class CountOccurrence 
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the  String ");
		String s=ab.nextLine();

		char ch[]=s.toCharArray();

		for(int i=0; i<ch.length; i++)
		{
			int count=1;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0' && ch[i]!=' ')
			{
				
					System.out.println(ch[i]+"----->"+count+" times");
				
			}
		}
	}
}
