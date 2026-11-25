import java.util.Scanner;
class SumOfFactorial_for
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = s.nextInt(),fact=1,sum=0;
		for(int i=n;i!=0;i/=10)
		{
		    int last=i%10;
		    sum+=last;
		}
		System.out.print(sum);
	}
}
