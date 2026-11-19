import java.util.Scanner;
class Marks 
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
		
		System.out.println("Marks1 "+(marks1>35 && marks1<=100));
		System.out.println("Marks2 "+(marks2>35 && marks2<=100));
		System.out.println("Marks3 "+(marks3>35 && marks3<=100));
	}
}
