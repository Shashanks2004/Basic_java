import java.util.Scanner;
class Age
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = s.nextInt();
		System.out.println(age>18 && age<60);
	}
}
