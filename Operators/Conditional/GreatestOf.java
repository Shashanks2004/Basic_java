import java.util.Scanner;
class GreatestOf
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a = s.nextInt(),b=s.nextInt();
		int res = a>b ? a : b;
		System.out.println(res+"Is greatest");
	}
}
