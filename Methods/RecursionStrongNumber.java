import java.util.Scanner;
class RecursionStrongNumber
{
	public static int sum (int n)
	{
		return n==0 ? 0 : factorial(n%10)+sum(n/10);
	}
	public static int factorial(int n)
	{
		return n==1 ? 1 : n*factorial(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int res = sum(n);
		System.out.println(res==n ? n+" is Strong Number " : n+" is not a Strong Number");
	}
}
