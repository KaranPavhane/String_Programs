public class FindSecondLargestNumber{
	public static void main(String x[]){
		int a[]={10,40,50,20,80,90,80};

		int max=0;
		int sec=0;
		for(int i=0; i<a.length; i++){
			if(a[i]>max){		//10>0  // 40>10
				sec=max;		//0		//10
				max=a[i];		//10	//
			}else if(a[i]>sec && sec!=max){
				sec=a[i];
			}
		}

		System.out.println("Max :: "+max);
		System.out.println("Sec :: "+sec);
	}
}