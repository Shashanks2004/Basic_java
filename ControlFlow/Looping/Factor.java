import java.util.Scanner;
class Factor 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt(),start=1,fact=1;
		while(start<=n){
			if(n%start==0){
			     System.out.print(start+" ");
			}
			start++;
		}
	}
}
