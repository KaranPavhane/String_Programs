//Find Number of Words In String ......
import java.util.*;

public class FindNumberOfWordsInString
{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();

		int word=0;
		int lastword=0;
	
		try{
			if(str.charAt(0)!=' ')
			{
				word=1;
			}
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println("String is Empty ");
		}

		for(int i=0; i<str.length()-1; i++){
			if(str.charAt(i)==' '){
				lastword=word;
				word++;
			}
			if(str.charAt(i)==' '&& str.charAt(i+1)==' ')
			{
				word=lastword;
			}
		}
		System.out.println("Number of Words in String is : "+ word);
	}
}