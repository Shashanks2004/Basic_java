import java.util.Scanner;
class SmallestOf3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int a = s.nextInt(),b=s.nextInt(),c=s.nextInt();
		if(a<b && a<c)
			System.out.println(a+" is smallest");
		else if(b<c)
		    System.out.println(b+" is smallest");
		else 
			System.out.println(c+" is smallest");
	}
}
