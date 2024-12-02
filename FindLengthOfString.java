import java.util.*;
// 1. Write a  JAVA program to find length of a string. 
public class FindLengthOfString
{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		int count=0;

		try{
			for(int i=0; ;i++){
				str.charAt(i);
				count++;
			}
		}
		catch(Exception ex){
			System.out.println("Length of String is :: "+count);
		}
		
	}
}