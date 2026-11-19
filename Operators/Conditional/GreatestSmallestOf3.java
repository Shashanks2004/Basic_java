import java.util.Scanner;
class GreatestSmallestOf3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int a = s.nextInt(),b=s.nextInt(),c=s.nextInt();
		int res1 = a>b && a>c ? a : b>c ? b : c;
		int res2 = a<b && a<c ? a : b<c ? b : c;
		System.out.println(res1+" Is greatest");
		System.out.println(res2+" Is smallest");
	}
}
