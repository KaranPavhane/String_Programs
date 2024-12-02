import java.util.*;

public class   FindMissingElement{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array ");
		int a[]=new int[5];
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[i]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
			}
		}

		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<a.length-1; i++){
			for(int j=a[i]+1; j<a[i+1]; j++){
				System.out.println(j);
			}
		}


	}		
}
