import java.util.*;
// 2. Write a  JAVA program to copy one string to another string.
public class CopyString{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		//System.out.println("String is : "+str);
		
		StringBuilder ss=new StringBuilder("");
		for(int i=0; i<str.length(); i++){
			ss.append(str.charAt(i));
		}

		System.out.println("Copy String is : "+ss);
	}
}
