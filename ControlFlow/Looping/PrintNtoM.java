import java.util.Scanner; 
class PrintNtoM
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter m & n value: ");
		int m=s.nextInt(), n=s.nextInt();
		while(m<=n){
			System.out.print(n+" ");
			n--;
		}
	}
}
