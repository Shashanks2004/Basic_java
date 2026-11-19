import java.util.Scanner;
class LessThan
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		String res = n<=75 ? n+"is Less than or equal to 75" : n+"is not Less than 75";
		System.out.println(res);
	}
}
