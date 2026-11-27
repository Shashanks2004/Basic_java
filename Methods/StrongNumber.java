import java.util.Scanner;
class StrongNumber
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int start=1;start<=n;start++)
		{
			fact*=start;
		}
		return fact;
	}
	public static boolean isStrong(int n)
	{
		int sum=0,last=0;
		for(int temp=n;temp!=0;temp/=10){
			last = temp%10;
			sum+=factorial(last);
		}
		return sum==n;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		System.out.println(isStrong(n) ? n+"is a strong number" : n+" is not a strong number" );
	}
}
