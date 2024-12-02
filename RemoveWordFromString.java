import java.util.*;
public class RemoveWordFromString{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		System.out.println("Enter Word ");
		String word=sc.nextLine();

		String s[]=str.split(" ");
		StringBuilder ss=new StringBuilder();

		for(int i=0; i<s.length; i++){
			if(!s[i].equals(word)){
				ss.append(s[i]).append(" ");
			}
		}
		System.out.println(ss);
	}
}