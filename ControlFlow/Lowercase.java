import java.util.Scanner;
class Lowercase
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		if(c>='a' && c<='z')
			System.out.println(c+" is Lowercase");
		else
		    System.out.println(c+" is not Lowercase");
	}
}
