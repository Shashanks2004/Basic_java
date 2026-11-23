import java.util.Scanner;
class ReverseNumbers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int start=s.nextInt(),end=1;
		while(start>=end){
				System.out.println(start);
			    start--;
		}
	}
}
