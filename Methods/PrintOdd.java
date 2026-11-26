import java.util.Scanner;
class PrintOdd 
{
	public static void odd(int a)
	{
		for(int i=1;i<=a;i++)
		{
			if(i%2!=0)
			   System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		odd(n);
	}
}
