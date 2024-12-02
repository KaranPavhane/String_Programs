import java.util.*;
// 7. Write a  JAVA program to toggle case of each character of a string. 
public class ToggleCaseOfString{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str =sc.nextLine();

		char ch[]=new char[str.length()];
		for(int i=0; i<str.length(); i++){
			char c=str.charAt(i);
			if(c>='a' && c<='z'){
				ch[i]=(char)(c-32);
			}
			else if(c>='A' && c<='Z'){
				ch[i]=(char)(c+32);
			}
			else{
				ch[i]=c;
			}
		}

		String s=new String (ch);
		System.out.println(s);
	}
}
