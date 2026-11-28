import java.util.Scanner;
class RecursionEvenPrint 
{
	public static int evenDigit(int start,int n)
	{
		return n==0 ? 0 : n%start==0 ? n+evenDigit(start+1,n) : evenDigit(start+1,n);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		int res=evenDigit(1,n);
		System.out.println(res);
	}
}
