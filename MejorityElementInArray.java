import java.util.*;

public class MejorityElementInArray{
	public static void main(String x[]){
		int a[]={10,30,40,50,10,10,10};
		
		int mid=a.length/2;
		System.out.println("Mid : "+mid);
	
		boolean flag=false;
		int index=-1;
		int count=-1;
		for(int i=0; i<a.length; i++){
			 count=1;
			for(int j=i+1; j<a.length;j++){
				if(a[i]==a[j]){
					count++;
					
				}
			}
			if(count>mid){
				flag=true;
				index=i;
				break;
			}
		}

		System.out.println("Count :: "+count);
		if(flag){
			System.out.println("Majority element is :: "+a[index]);
		}else{
			System.out.println("not a majority element");
		}
	}
}