import java.util.Scanner; 
class EvenOddCount
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int start=1, n=s.nextInt(),evenCount=0,oddCount=0;
		while(start<=n){
			if(start%2==0)
				evenCount++;
			else
				oddCount++;
			start++;
		}
		System.out.println("Even count is : "+evenCount);
		System.out.println("Odd count is : "+oddCount);
	}
}
