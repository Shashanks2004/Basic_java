import java.util.Scanner;
class PrintReturn 
{
	public static int Count(int a)
	{
		int count=0;
		for(;a!=0;a/=10)
		{
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		int res=Count(n);
		System.out.println("Count of "+n+" is : "+res);
	}
}
