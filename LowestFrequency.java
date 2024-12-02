//19.Write a  JAVA program to find lowest frequency character in a string. 

import java.util.*;

public class LowestFrequency
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the String ");
		String s=ab.nextLine();

		char ch[]=s.toCharArray();		//karan

		int Lcount=1;
		char temp=0;
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
			if(count<=Lcount && ch[i]!='\0' && ch[i]!=' ')
			{
				Lcount=count;
				temp=ch[i];
				System.out.println(temp+"---->"+ Lcount +" times");
			}
		}
		
	}
}
