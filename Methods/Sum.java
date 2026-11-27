import java.util.Scanner;
class Sum
{
	public static int add(int n)
	{
		int sum=0;
		for(int last=0;n!=0;n/=10){
			last = n%10;
			sum+=last;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		System.out.println(add(n));
	}
}
