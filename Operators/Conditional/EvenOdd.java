import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		String res = n%2==0 ? n+" is Even" : n+"is Odd";
		System.out.println(res);
	}
}
