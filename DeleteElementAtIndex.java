
import java.util.*;

public class DeleteElementAtIndex{
	public static void main(String x[]){
		int a[]={10,20,30,40,20,50};
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Element to delete ");
		int no=sc.nextInt();
		
		int count=0;
		for(int i=0; i<a.length; i++){
			if(no==a[i]){   //20
				count++;
				for(int j=i; j<a.length-count; j++){ //j=20 j<5;
					a[j]=a[j+1];			//20=30=30
				}
			}
		}

		System.out.println("Array after delete");
		for(int i=0; i<a.length-count; i++){
			System.out.println(a[i]);
		}


	}
}