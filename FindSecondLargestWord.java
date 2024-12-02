import java.util.*;

public class FindSecondLargestWord{
	public static void main(String x[]){
		String s="India is my  Country";
		String str[]=s.split(" ");
		int max=0;
		int sec=0;
		String ss="";

		for(int i=0; i<str.length; i++){
			if(str[i].length()>max){
				sec=max;
				
				max=str[i].length();
				
			}else if(sec<str[i].length() && sec!=max){
				
				sec=str[i].length();
				ss=str[i];
			}		
		}

		System.out.println("Max :: "+max);
		System.out.println("Second max :: "+sec);
		System.out.println(ss);
	}
}