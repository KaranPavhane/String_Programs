//2. Write a  JAVA program to copy one string to another string. 


import java.util.*;

public class CopyStringtoChar
{
		public static void main(String x[])
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter String ");
			String ab = scn.nextLine();

			System.out.println("Before copy : "+ab);

			String copy = new String(ab);

			System.out.println("After copy : "+copy);
			
			String copy2 = ab;

			System.out.println("After copy2 : "+copy2);
			System.out.println("Before copy : "+ab);
		}
}