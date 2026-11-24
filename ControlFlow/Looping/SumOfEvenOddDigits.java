import java.util.Scanner; 
class SumOfEvenOddDigits
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int m=1,n=s.nextInt(),evenSum=0,oddSum=0;
		while(m<=n){
			int last = n%10;
			if(last%2==0)
				evenSum+=last;
			else
				oddSum+=last;
			n/=10;
		}
		System.out.println("Even Sum is : "+evenSum);
		System.out.println("Odd Sum is : "+oddSum);
	}
}
