import java.util.*;
// 5. Write a  JAVA program to convert lowercase string to uppercase.
public class ConvertInLowercase{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ");
		String str=sc.nextLine();

		char ch[]=new char[str.length()];
		for(int i=0; i<str.length(); i++){
			char c=str.charAt(i);
			if(c>='a' && c<='z'){
				ch[i]=(char)(c-32);
			}else{
				ch[i]=c;
			}
		}

		String s=new String(ch);
		System.out.println("Converted String is : "+s+" length : "+s.length());
	}
}