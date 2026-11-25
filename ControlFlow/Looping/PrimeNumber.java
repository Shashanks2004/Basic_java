import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt(),start=1,count=0;
		while(start<=n){
			if(n%start==0)
				count++;
			start++;
		}
		System.out.println(count==2 ? n+" is prime" : n+" is not prime ");
	}
}
