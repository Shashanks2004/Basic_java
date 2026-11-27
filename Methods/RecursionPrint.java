import java.util.Scanner;
class RecursionPrint 
{
	public static void print(int a)
	{
		if(a==0)
			return;
		System.out.println(a);
		print(a-1);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		print(n);
	}
}
