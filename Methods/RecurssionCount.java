import java.util.Scanner;
class RecurssionCount 
{
	public static int count(int n)
	{
		return n==0 ? 0 : 1+count(n/10) ; 
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n value");
		int n = s.nextInt();
		int res = count(n);
		System.out.println(res);
	}
}
