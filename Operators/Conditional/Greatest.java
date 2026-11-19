import java.util.Scanner;
class Greatest
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		String res = n>100 ? n+"is greater than 100" : n+"is not greater than 100";
		System.out.println(res);
	}
}
