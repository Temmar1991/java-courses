 

public class Calculate{
	
	public static void main(String[] args)
	{
		System.out.println("Calculate...");
		
		add(4,67);
		subs(56,456);		
	}
	
	public static void add(int a, int b){
		int result = a + b;
		System.out.println("Sum " + result);
	}
	
	public static void subs(int a, int b)
	{
		int result = a - b;
		System.out.println("Sabs " + result);
	}
}