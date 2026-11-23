import java.util.Scanner;
class EvenOddSwitch
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		switch(n%2)
		{
			case 0 : System.out.println("Is even");
			         break;
			case 1 : System.out.println("Is odd");		
		}
	}
}
