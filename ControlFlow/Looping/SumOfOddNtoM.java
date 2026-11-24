import java.util.Scanner; 
class SumOfOddNtoM
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter m & n value: ");
		int m=s.nextInt(),n=s.nextInt(),oddSum=0;
		while(m<=n){
			if(n%2==1)
				oddSum+=n;
			n--;
		}
		System.out.println("Odd Sum is : "+oddSum);
	}
}
