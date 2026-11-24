import java.util.Scanner;
class PrintCount
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = s.nextInt(),count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}
