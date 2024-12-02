import java.util.*;
// 3. Write a  JAVA program to concatenate two strings.
public class CopyTwoStrings{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String ");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd String ");
		String s2=sc.nextLine();

		int len1=s1.length();
		int len2=s2.length();

		char ch[]=new char[len1+len2+1];

		for(int i=0; i<s1.length(); i++){
			ch[i]=s1.charAt(i);
		}
		ch[s1.length()]=' ';
		for(int i=s1.length()+1, j=0; j<s2.length(); i++,j++){
			ch[i]=s2.charAt(j);
		}

		String str=new String(ch);
		System.out.println("Copied String is : "+str);

	}
}
