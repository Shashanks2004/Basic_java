import java.util.Scanner;
class PrintDigit 
{
	public static void digit(int a)
	{
		for(int i=0;a!=0;a/=10)
		{
			i=a%10;
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		digit(n);
	}
}
