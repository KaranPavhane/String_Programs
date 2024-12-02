import java.util.*;

public class NumberOfWordsInGivenString
{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();

		int lastword=0;
		int word=0;
		try{
			if(s.charAt(0)!=' '){
				word=1;
			}
		}
		catch(StringIndexOutOfBoundsException ex){
			System.out.println("String is Empty ");
		}

		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)==' '){
				lastword=word;
				word++;
			}
			if(s.charAt(i)==' ' && s.charAt(i+1)==' '){
				word=lastword;
			}
		}
		System.out.println("Number of Words in String is : "+word );

	}
}