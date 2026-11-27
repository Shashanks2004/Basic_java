import java.util.Scanner;
class RecursionEven
{
	public static void print(int a)
	{
		if (a==0)
		{
			return;
		}
		print(a-1);
		System.out.println( a%2==0 ? a : );
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		print(n);
	}
}
