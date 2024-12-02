

public class  FindOccurrenceOfNumber
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50,50,30,60,20,90}	;

		for(int i=0; i<a.length; i++){
			int count=1;
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					count++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1){
				System.out.println(a[i]+ "is "+count+" times");
			}
		}

	}
}
