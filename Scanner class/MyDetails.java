import java.util.Scanner;
class MyDetails 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = s.nextInt();
		System.out.println("Enter name : ");
		String name = s.next();
		System.out.println("Age = "+ age);
		System.out.println("Name = "+name);
	}
}
