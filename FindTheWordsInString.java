import java.util.*;
// Write a  JAVA program to count total number of words in a string.
public class FindTheWordsInString{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		
		int ward=0;

		String s[]=str.split(" ");


		System.out.println("Word in Sentance "+s.length);
	}
}