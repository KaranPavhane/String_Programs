import java.util.Scanner;
// 4. Write a  JAVA program to compare two strings
public class CompareTwoString{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String ");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd String ");
		String s2=sc.nextLine();
		
		boolean flag=false;
		if(s1.length()==s2.length()){
			for(int i=0; i<s1.length(); i++){
				if(s1.charAt(i)==s2.charAt(i)){
					flag=true;
				}else{
					flag=false;
				}
			}
		}

		if(flag){
			System.out.println("String is Equals");
		}else{
			System.out.println("String is not equals ");
		}
	}
}
