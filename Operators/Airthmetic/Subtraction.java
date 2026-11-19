import java.util.Scanner;
class Subtraction 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = s.nextInt(),b=s.nextInt();
		int c = a-b;
		System.out.println(a+" - "+b+" = "+c);
	}
}