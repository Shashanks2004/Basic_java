import java.util.Scanner;
class Factorial_for
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = s.nextInt(),fact=1;
		for(int i=1;i<=n;i++)
		{
		    fact*=i;
		}
		System.out.print(fact);
	}
}
