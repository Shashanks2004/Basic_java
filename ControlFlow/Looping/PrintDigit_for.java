import java.util.Scanner;
class PrintDigit_for
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = s.nextInt(),start=1,evenCount=0,oddCount=0;
		for(int i=0;n!=0;n/=10)
		{
		    i=n%10;
			System.out.print(i+" ");
		}
	}
}
