//8. Write a  JAVA program to find total number of alphabets, digits or special character in a string. 

import java.util.*;

public class CountOfCharacters
{
		public static void main(String x[])
		{
				Scanner ab=new Scanner(System.in);
				System.out.println("Enter the String ");
				String a=ab.nextLine();
	
				//char ch=new char[a.length()];
				int ai=0,aj=0,ak=0;
				for(int i=0; i<a.length(); i++)
				{
					if(a.charAt(i)>='a' && a.charAt(i)<='z')
					{
							ai++;
					}

					else if (a.charAt(i)>='0' && a.charAt(i)<='9')
					{
							aj++;
					}
					else
					{
							ak++;
					}

				}
				System.out.println("Character in String  : "+ai);
				System.out.println("Digits int String : "+aj);
				System.out.println("Special Symbol in String : "+ak);
				ab.close();
		}
}
