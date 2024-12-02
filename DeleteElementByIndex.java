public class DeleteElementByIndex{
	public static void main(String x[]){
		int a[]={10,20,30,40,50,};
		int no=50;

		int index=2;
		--index;

		if(index<a.length){
			for(int i=index; i<a.length-1; i++){
			a[i]=a[i+1];
			}

			System.out.println("By Index...");
			for(int i=0; i<a.length-1; i++){
			System.out.println(a[i]);
		}
		}
		else{
			System.out.println("Index is not present");

		}
		


		for(int i=0; i<a.length; i++){
			if(a[i]==no){
				for(int j=i; j<a.length-1; j++){
					a[j]=a[j+1];
				}
			}
		}

		System.out.println("Array after Delete Element");
		for(int i=0; i<a.length-1; i++){
			System.out.println(a[i]);
		}
	}
}