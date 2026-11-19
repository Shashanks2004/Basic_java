import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		if(c>='A' && c<='Z')
			System.out.println(c+" is Uppercase");
		else
		    System.out.println(c+" is not Uppercase");
	}
}
