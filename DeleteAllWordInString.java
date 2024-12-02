import java.util.*;

public class DeleteAllWordInString{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();

		System.out.println("Enter the word to Delete Words in String ");
		String word=sc.nextLine();

		String s[]=str.split(" ");
		StringBuilder ss=new StringBuilder("");
		int count=1;
		for(int i=0; i<s.length; i++){
			
			if((s[i].equals(word)) && (count==1)){
				count++;
				continue;
				
			}else{
				ss.append(s[i]).append(" ");
				
			}
		}
		System.out.println("String after deleting the words :: "+ss);
	}
}