import java.util.Scanner;
class Login
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username :");
		String userName = s.next();
		System.out.println("Enter Password :");
		int password = s.nextInt();
		System.out.println("Login : "+(userName.equals("Admin") && password==1234));
	}
}
