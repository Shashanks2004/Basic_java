import java.util.Scanner; 
class SumOfEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int m=1,n=s.nextInt(),evenSum=0,oddSum=0;
		while(m<=n){
			if(m%2==0)
				evenSum+=m;
			else
				oddSum+=m;
			m++;
		}
		System.out.println("Even Sum is : "+evenSum);
		System.out.println("Odd Sum is : "+oddSum);
	}
}
