import java.util.Scanner;
class NumberInput
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();
		System.out.println((num>0 && num<10) && num!=5 );
	}
}
