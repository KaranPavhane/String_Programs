import java.util.*;

public class FindMissingElementWothoutShorting{
	public static void main(String  x[]){
		int a[]={1,5,3,9,12};

		int max=0;
		int min=a[0];
		for(int i=0; i<a.length; i++){
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println("Max :: "+max);
		System.out.println("Min :: "+min);

		for(int i=min; i<=max; i++ ){
			boolean flag=false;
			for(int j=0; j<a.length; j++){
				if(i==a[j]){
					flag=true;
					break;
					
				}
			}
			if(!flag){
				System.out.println(i);
			}
		}	
	}

}