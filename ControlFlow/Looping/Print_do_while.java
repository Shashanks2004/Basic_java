import java.util.Scanner;
class Print_do_while
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt(),start=1;
		do
		{
			System.out.print(start);
			start++;
		}
		while (start<=n);
	}
}
