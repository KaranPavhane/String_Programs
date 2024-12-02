//41. WAP a JAVA Program to check strings are anagram to each other or not ? 

import java.util.*;

public class CheckAnagramString
{
	public static  void main(String x[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String ");
		String str1=sc.nextLine();

		System.out.println("Enter the 2nd String ");
		String str2=sc.nextLine();

		if(isAnagram(str1,str2)){
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String are not Anagram ");
		}


/* 
		boolean flag=false;

		if(s.length()==str.length())
		{
			for(int i=0; i<s.length(); i++)
			{
				int count1=0;
				int count2=0;
				for(int j=0; j<s.length(); j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count1++;
					}
					if(s.charAt(i)==str.charAt(j))
					{
						count2++;
					}
					if(count1==count2)
					{
						flag=true;
					}
					else
					{
						flag=false;
						break;
					}
				}
			}
		}
		if(flag)
		{
			System.out.println("String is anagram ");
		}
		else
		{
			System.out.println("String is Not Anagram ");
		}
*/
	}

	public static boolean isAnagram(String str1,String str2){

		//remove the spaces between string ;
		str1=str1.replaceAll("\\s","");
		str2=str2.replaceAll("\\s","");

		boolean flag=false;
		
		//checking the length of String String 
		if(str1.length()!=str2.length()){
			return false;
		}

		//short and compare;
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==arr2[i])
			{
				flag=true;
			}
			else{
				return false;
			}
		}

		//return Arrays.equals(arr1, arr2);
		return flag;
	}
}
