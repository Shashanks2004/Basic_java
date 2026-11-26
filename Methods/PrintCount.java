import java.util.Scanner;
class PrintCount 
{
	public static void total(int a)
	{
		int count=0;
		for(int i=0;a!=0;a/=10)
		{
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		total(n);
	}
}
