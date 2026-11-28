import java.util.Scanner;
class RecursionDigitEven
{
	public static void print(int a)
	{
		if(a==0)
			return;
		if(a%2==0){
			print(a/10);
			System.out.println(a%10);
		}else{
			print(a/10);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		print(n);
	}
}
