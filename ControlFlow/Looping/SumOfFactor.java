import java.util.Scanner;
class SumOfFactor 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt(),start=1,fact=1,sum=0;
		while(start<=n){
			if(n%start==0)
			    sum+=start;
			start++;
		}
		System.out.println(" sum is "+sum);
	}
}
