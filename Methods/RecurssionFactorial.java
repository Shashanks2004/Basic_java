import java.util.Scanner;
class RecurssionFactorial
{
	public static int factorial(int n)
	{
		return n==0 ? 1 : n*factorial(n-1); 
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n value");
		int n = s.nextInt();
		int res = factorial(n);
		System.out.println(res);
	}
}
