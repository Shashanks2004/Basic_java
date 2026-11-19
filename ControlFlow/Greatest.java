import java.util.Scanner;
class Greatest
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a = s.nextInt(),b=s.nextInt();
		if(a>b)
			System.out.println(a+" is greatest");
		else
		    System.out.println(b+" is greatest");
	}
}
