
public class FindNextHighestElement{
	public static void main(String x[]){
		int a[]={5,3,10,9,6,16};
		
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]<a[j]){
					System.out.println(a[j]);
					break;
				}
			}
		}
	}
}