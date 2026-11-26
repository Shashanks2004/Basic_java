import java.util.Scanner;
class Factorial 
{
	public static int factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		int res=factorial(n);
		System.out.println("Factorial of "+n+" is : "+res);
	}
}
