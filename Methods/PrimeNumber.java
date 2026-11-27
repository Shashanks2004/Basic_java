import java.util.Scanner;
class PrimeNumber
{
	public static boolean isPrime(int n)
	{
		for(int start=2;start<=n/2;start++)
		{
			if(n%start==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		System.out.println(isPrime(n) ? n+"is a Prime number" : n+" is not a Prime number" );
	}
}
