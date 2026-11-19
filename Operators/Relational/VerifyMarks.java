import java.util.Scanner;
class VerifyMarks
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks 1: ");
		int marks1=s.nextInt();
		System.out.println("Enter marks 2: ");
		int marks2=s.nextInt();
		System.out.println("Enter marks 3: ");
		int marks3=s.nextInt();
		
		System.out.println("Result 1: "+(marks1>35));
		System.out.println("Result 1: "+(marks2>35));
		System.out.println("Result 1: "+(marks3>35));
	}
}
