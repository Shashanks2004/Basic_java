import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = s.nextInt(),sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10,fact=1;
			for(int j=1;j<=last;j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
		System.out.print(sum==n ?n+"is strong number" : n+"is not a strong number");
	}
}
