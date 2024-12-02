//10.Write a  JAVA program to count total number of words in a string. 
import java.util.*;

public class NumberOfWordsInString
{
	public static void main(String x[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=ab.nextLine();

		int word=0;
		if(s.length()!=0 &&s.charAt(0)!=' ')
		{
			word=1;
		}
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				word++;
			}
		}

		System.out.println("Number Of Word : "+word);
	}
}