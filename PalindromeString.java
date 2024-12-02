//12. Write a  JAVA program to check whether a string is palindrome or not. 

import java.util.*;

public class PalindromeString
{
		public static void main(String x[])
		{
				Scanner ab=new Scanner(System.in);

				System.out.println("Enter the String ");
				String a=ab.nextLine();

				char ch[]=a.toCharArray();

				char ch1[]=new char[a.length()];

				for(int i=0; i<a.length(); i++)
				{
						ch1[i]=ch[i];
				}

				int end=a.length()-1;
				int mid=a.length()/2;

				for(int i=0; i<mid; i++)
				{
						char temp=ch[i];
						ch[i]=ch[end];
						ch[end]=temp;
						end--;
				}

				boolean flag=false;
				for(int i=0 ;i<a.length(); i++)
				{
						if(ch[i]==ch1[i])
						{
								flag=true;
						}
						else
						{
							flag=false;
							break;
						}
				}
				if(flag)
				{
						System.out.println("Palindrome ");
				}
				else
				{
						System.out.println("Not Palindrome ");
				}


		}
}