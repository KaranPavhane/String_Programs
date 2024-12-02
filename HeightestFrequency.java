//18.Write a  JAVA program to find highest frequency character in a string. 

import java.util.*;

public class HeightestFrequency
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the String ");
		String s=ab.nextLine();

		char ch[]=s.toCharArray();

		int mcount=0;
		int temp=-1;

		for(int i=0; i<ch.length; i++)
		{
				int count=1;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j] && ch[i]!=32)
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count>mcount)
			{
				mcount=count;
				temp=i;
			}
		}
		if(temp!=-1 && mcount!=1)
		{
			System.out.println(ch[temp]+"------->"+mcount+" times");
		}
		else{
			System.out.println("All character has same occurrence");
		}
	}
}
