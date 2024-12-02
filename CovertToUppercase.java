//5. Write a  JAVA program to convert lowercase string to uppercase. 

import java.util.*;

public class CovertToUppercase
{
	public static void main(String x[])
	{
			Scanner ab=new Scanner(System.in);

			System.out.println("Enter the String ");
			String a=ab.nextLine();
/*
			char s[]=new char[a.length()];
			for(int i=0; i<a.length(); i++)
			{
					s[i]=(char)(a.charAt(i)-32);
			}

			String ss=new String(s);
			System.out.println(ss);
*/

			String b=a.toUpperCase();
			System.out.println(b);
	}
}
