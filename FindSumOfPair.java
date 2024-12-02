import java.util.*;

public class FindSumOfPair{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);

		int a[]={20,30,10,40,50};
		System.out.println("Enter the Sum for pair");
		int sum=sc.nextInt();

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]+a[j]==sum){
					System.out.println(a[i]+"\t"+a[j]);
				}
			}

		}
	}
}