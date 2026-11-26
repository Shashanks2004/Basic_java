import java.util.Scanner;
class Print 
{
	public static void print(int a)
	{
		for(int start=1;start<=a;start++)
		{
			System.out.print(start+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		print(n);
	}
}
