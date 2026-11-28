import java.util.Scanner;
class RecursionEvenPrint 
{
	public static void evenDigit(int n)
	{
		if(n==0)
			return;
		if(n%2==0){
			evenDigit(n-1);
			System.out.println(n);
		}else{
			evenDigit(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		evenDigit(n);
	}
}
