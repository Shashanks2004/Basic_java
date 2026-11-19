import java.util.Scanner;
class Find
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		if(c>='0' && c<='9')
			System.out.println(c+" is digit");
		else if(c>='A' && c<='Z')
		    System.out.println(c+" is uppercase");
		else if(c>='a' && c<='z')
			System.out.println(c+" is lowercase");
		else
			System.out.println(c+" is SpecialCharcter");
	}
}
