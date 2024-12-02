//32. Write a JAVA program to count occurrences of a word in a given string. 

import java.util.*;

public class CountOfWord
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("Enter the Array of String ");
		String str=ab.nextLine();
		/* 
		String s[]=new String[8];
		for(int i=0; i<s.length; i++)
		{
			s[i]=ab.nextLine();
		}
		*/
		System.out.println("Enter the Word to Find Occurrence ");
		String word=ab.nextLine();
		findCountOfWord(str,word);
	
/* 
		int count=0;
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals(str))
			{
				count++;
			}
		}

		if(count!=0)
		{
			System.out.println(str+" is present in the String is : "+count+" times");
		}
		else
		{
			System.out.println("Word not present is String ");
		}
	*/
	}
	public static void findCountOfWord(String str,String word){
		int index=0;
		int count=0;
		//System.out.println("Count of Words in String : "+count);

		while(index<str.length()){
			index=str.indexOf(word,index);
			if(index!=-1){
				count++;
				index=index+word.length();
			}
			else{
				break;
			}
		}
		System.out.println("Count of Words in String : "+count);
	}
}

