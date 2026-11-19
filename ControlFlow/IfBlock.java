import java.util.Scanner;
class IfBlock
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if(n%9==0)
			System.out.println(n+" is divisible by 9");
	}
}
