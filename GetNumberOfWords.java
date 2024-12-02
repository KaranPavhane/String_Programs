public class GetNumberOfWords 
{
	public static void main(String[] args) 
	{
		String str = "        a karan is jev ankita        ";
		getNumberOfWords(str);
	}
	private static void getNumberOfWords(String str){
		int count = 0;
		if(str.length()!=0 && str.charAt(0)!=' ')
		{
			count=1;
		}
		for (int i = 0;i<str.length()-1;i++)
		{
			if(str.charAt(i)  == ' ' && str.charAt(i+1)  != ' '){
				count++;
			}
		}
		System.out.println(count);
	}
}
