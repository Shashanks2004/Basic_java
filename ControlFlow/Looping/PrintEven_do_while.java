import java.util.Scanner;
class PrintEven_do_while
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt(),start=1;
		do
		{
			if(start%2==0)
			    System.out.print(start);
			start++;
		}
		while (start<=n);
	}
}
