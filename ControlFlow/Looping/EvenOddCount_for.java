import java.util.Scanner;
class EvenOddCount_for
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value ");
		int n = s.nextInt(),start=1,evenCount=0,oddCount=0;
		for(int i=1;n!=0;n/=10)
		{
			i=n%10;
			if(i%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.print(evenCount+" "+oddCount);
	}
}
