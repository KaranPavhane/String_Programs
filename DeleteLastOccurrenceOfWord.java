import java.util.*;

public class DeleteLastOccurrenceOfWord{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		System.out.println("Enter Word ");
		String word=sc.nextLine();

		String s[]=str.split(" ");
		StringBuilder ss=new StringBuilder("");
		int count=1;
		for(int i=s.length-1; i>=0; i--){
			if(s[i].equals(word) && count==1){
				count++;
				continue;
			}else{
				ss.append(s[i]).append(" ");
			}

		}
		System.out.println(ss.reverse());
	}
}