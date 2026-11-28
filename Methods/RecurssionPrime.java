import java.util.Scanner;
class RecurssionPrime 
{
	public static int factor(int start,int n)
	{
		return n==start ? 1 : n%start==0 ? 1+factor(start+1,n) : factor(start+1,n) ; 
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter n value");
		int n = s.nextInt();
		int res = factor(1,n);
		System.out.println(res==2 ? n+" is prime " : n+"is not prime" );
	}
}
