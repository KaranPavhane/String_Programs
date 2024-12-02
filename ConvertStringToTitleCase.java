/*
10. Convert String to Title Case
Problem: Write a Java program to convert a given string to title case,
where the first letter of each word is capitalized. 
For example, "java programming language" should become "Java Programming Language".
*/

import java.util.*;

public class ConvertStringToTitleCase
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();

		char ch[] = s.toCharArray();

		
		for(int i=0; i<s.length(); i++)
		{
			if((i==0 && s.charAt(i) != ' ')||(s.charAt(i-1)==' ')){
				if(s.charAt(i)>=97 && s.charAt(i)<=122){
					ch[i] = (char) ((int)ch[i]-32);
				}
			}
		}
		String newString = new String(ch);
		System.out.println(newString);
	}
}
