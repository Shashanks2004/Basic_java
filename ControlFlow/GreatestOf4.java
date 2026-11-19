import java.util.Scanner;
class GreatestOf4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 4 number");
		int a = s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();
		if(a>b && a>c && a>d)
			System.out.println(a+" is greatest");
		else if(b>c && b>d)
		    System.out.println(b+" is greatest");
		else if(c>d)
			System.out.println(c+" is greatest");
		else 
			System.out.println(d+" is greatest");
	}
}
