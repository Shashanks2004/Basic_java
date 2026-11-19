import java.util.Scanner;
class RandomNumber
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a random number :");
		int num = s.nextInt();
		System.out.println(num<10 || num >100);
	}
}
