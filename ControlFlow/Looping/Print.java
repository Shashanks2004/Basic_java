import java.util.Scanner;
class Print
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt();
		while(n!=0){
			int last = n%10;
			System.out.print(last+" ");
			n=n/10;
		}
	}
}
