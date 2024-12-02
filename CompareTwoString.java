//4. Write a  JAVA program to compare two strings 

import java.util.*;

public class CompareTwoString
{
		public static void main(String x[])
		{
				Scanner ab=new Scanner(System.in);

				System.out.println("Enter the 1st String ");
				String a=ab.nextLine();
				System.out.println("Enter the 2nd String ");
				String b=ab.nextLine();
/*
				int lenA=a.length();
				int lenB=b.length();

				boolean flag=false;
				if(lenA==lenB)
				{
						for(int i=0; i<lenA; i++)
						{
								if(a.charAt(i)==b.charAt(i))
								{
									flag=true;
								}
								else
								{
									flag=false;
									break;
								}
						}
				}
				

				if(flag)
				{
						System.out.println("String is equal ");
				}
				else
				{
						System.out.println("String not equal ");
				}
*/

/*
				int s=a.compareTo(b);
				if(s==0)
				{
						System.out.println("String is equal ");
				}
				else
				{
						System.out.println("String not equal ");
				}
*/
			
			boolean res=a.equals(b);
			if(res)
				{
						System.out.println("String is equal ");
				}
				else
				{
						System.out.println("String not equal ");
				}
		}
}