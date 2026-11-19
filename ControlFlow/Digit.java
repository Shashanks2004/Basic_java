import java.util.Scanner;
class Digit
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		if(c>='0' && c<='9')
			System.out.println(c+" is Digit");
		else
		    System.out.println(c+" is not Digit");
	}
}
