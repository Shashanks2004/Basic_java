import java.util.Scanner;
class Print_for
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = s.nextInt(),start=1;
		for(;start<=n;start++)
		{
			System.out.print(start+" ");
		}
	}
}
