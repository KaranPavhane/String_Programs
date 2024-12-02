import java.util.*;
//  Write a  JAVA program to find total number of alphabets, digits or special character in a string.
public class FindAlphabetsDigitAndSpecialSymbol{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();

		int alpha=0;
		int digit=0;
		int special=0;

		for(int i=0; i<str.length(); i++){
			if((str.charAt(i)<='z' && (str.charAt(i)>='a')) || (str.charAt(i)<='Z' && (str.charAt(i)>='A'))){
				alpha++;
			}
			else if(str.charAt(i)<='9' && str.charAt(i)>='0'){
				digit++;
			}else{
				special++;
			}
		}

		System.out.println("Alphabet in String :: "+alpha);
		System.out.println("Digit in String :: "+digit);
		System.out.println("Special symbol is :: "+special);
	}
}