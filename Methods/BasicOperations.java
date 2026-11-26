import java.util.Scanner;
class BasicOperations 
{
	public static void add(int a, int b)
	{
		System.out.println("Addition of "+a+" + "+b+" is "+(a+b));
	}
		
	public static void sub(int a, int b)
	{
		System.out.println("Substraction of "+a+" - "+b+" is "+(a-b));
	}
		
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a & b value : ");
		int a=s.nextInt(),b=s.nextInt();
		add(a,b);
		sub(a,b);
	}
}
