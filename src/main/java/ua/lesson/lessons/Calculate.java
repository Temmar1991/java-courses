 
package ua.lesson.lessons;
public class Calculate{
	
	public static void main(String[] args)
	{
		System.out.println("Calculate...");
		
		add(4,67);
		subs(56,456);
		div(34,4);
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
	
	public static void div(int a, int b)
	{
		
		
		if (b == 0)
		{
			System.out.println("Division by null !!!");
		}
			
		else
		{
		int result = (a/b);
			
		System.out.println("Div: " + result);
		}	
		
		System.out.println("Success!!!");
		
		
		
		
		
	}
}