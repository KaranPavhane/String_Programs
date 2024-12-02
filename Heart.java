
public class Heart{
	public static void main(String []args){
		for(int i=1; i<=7; i++){
			for(int j=1; j<=9; j++){
				if(i<=3){
					if(j==4-i || j==2+i || j==8-i || j==6+i){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}else{
					if(j==i-2 ||  j==12-i){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}