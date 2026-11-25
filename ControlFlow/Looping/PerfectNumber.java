import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt(),start=1,sum=0;
		while(start<=n/2){
			if(n%start==0)
				sum+=start;
			start++;
		}
		System.out.println(sum==n ? n+" is perfect number " : n+" is not perfect number ");
	}
}
