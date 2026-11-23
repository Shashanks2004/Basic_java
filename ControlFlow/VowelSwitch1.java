import java.util.Scanner;
class VowelSwitch1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		switch(c)
		{
			case 'a','e','i','o','u','A','E','I','O','U' :  
				System.out.println(c+" is Vowel");
			break;
			default : System.out.println(c+" is not Vowel");		
		}
	}
}
