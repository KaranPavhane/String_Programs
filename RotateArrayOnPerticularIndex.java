public class RotateArrayOnPerticularIndex{
	public static void main(String x[]){
		int a[]={10,20,30,40,50,60,70,80,90};

		int index=3;

		int j=0;
		for(int i=0; i<index; i++){
			int temp=a[0];
			for(j=0; j<a.length-1; j++){
				a[j]=a[j+1];
			}
			a[j]=temp;
		}

		System.out.println("After Rotated ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"\t");
		}
	}
}