
//       jay hind vande maratram       jay shree     Ram

public class CountWordsString {
	public static void main(String[] args){
		String str = "       jay hind vande maratram       jay shree     Ram    f  asd  sddd s s s w w";

		int lastCount = 0;
		int words = 0;

		try{
			if(str.charAt(0)!=' '){
			words = 1;
		}
		}catch(IndexOutOfBoundsException e){
			System.out.println("String is empty");
		}

		for(int i=0;i<str.length()-1;i++){

			if((str.charAt(i)==' ')){
				lastCount = words;
				words++;
			}

			if(str.charAt(i)==' ' && str.charAt(i+1)==' '){
				words = lastCount;
			}

		}
		System.out.println("Number of words in String is : "+words);
	}

}