import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt(),start=1,fact=1;
		while(start<=n){
			fact*=start;
			start++;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
	}
}
