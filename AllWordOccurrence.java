//31.Write a JAVA program to search all occurrences of a word in given string. 

import java.util.*;

public class AllWordOccurrence
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);
		
		System.out.println("Enter the Array of String ");
		String s=ab.nextLine();

		System.out.println("Enter the Word to find in String ");
		String w=ab.nextLine();
		checkWordIndex(s,w);
/* 
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals(w))
			{
				System.out.println(w+" is present at the index of : "+i);
			}
	
		}
*/
	}

	public static void checkWordIndex(String s,String w)
	{
		int index=0;
		int count=0;
		while(index<s.length()){
			index=s.indexOf(w,index);
			if(index!=-1)
			{
				System.out.println("Word is Found At Index "+index);
				count++;
				//index=index+w.length();
			}
			else{
				break;
			}
			index=index+w.length();
		}
		System.out.println("Number Of Words present in String "+count);
	}
	
}
