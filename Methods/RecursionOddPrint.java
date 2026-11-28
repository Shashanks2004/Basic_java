import java.util.Scanner;
class RecursionOddPrint 
{
	public static void oddDigit(int n)
	{
		int ref=0;
		if(n==0)
			return;
		else if(n%10!=0)
			ref=n%10;
		    if(ref%2==1)
				System.out.println(ref);
		oddDigit(n/10);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		oddDigit(n);
	}
}
