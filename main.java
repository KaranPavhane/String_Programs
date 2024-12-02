class A{
	static int a=10;
	
	static {
		System.out.println("Static block "+ a);

	}
}

public class main
{
	public static void main(String[] args){
		Integer integerValue = Integer.valueOf(A.a);
        int hashCode = integerValue.hashCode();
        System.out.println("HashCode of static variable 'a': " + hashCode);

	}
}
