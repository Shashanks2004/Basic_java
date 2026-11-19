import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println(c+" is Vowel");
		else
		    System.out.println(c+" is not vowel");
	}
}
