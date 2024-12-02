//9. Write a  JAVA program to count total number of vowels and consonants in a string. 

import java.util.*;

public class FindVowelConsonant
{
		public static void main(String x[])
		{
				Scanner ab=new Scanner(System.in);

				System.out.println("Enter the String ");
				String s=ab.nextLine();

				int v=0,c=0;
				for(int i=0; i<s.length(); i++)
			{
						if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' )
						{
								v++;
						}
						else
						{
								c++;
						}
			}

				System.out.println("Vowels in String : "+v);
				System.out.println("Consonant in String : "+c);
		}
}
