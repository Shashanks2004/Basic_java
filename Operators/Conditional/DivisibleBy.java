import java.util.Scanner;
class DivisibleBy
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		String res = n%7==0 ? n+" is divisible by 7" : n+"is not divisible by 7";
		System.out.println(res);
	}
}
