import java.util.Scanner; 
class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=s.nextInt(),sum=0;
		while(n!=0){
			int last = n%10;
			sum+=last;
			n/=10;
		}
		System.out.println("Sum is : "+sum);
	}
}
