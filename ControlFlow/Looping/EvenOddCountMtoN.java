import java.util.Scanner; 
class EvenOddCountMtoN
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter m & n value: ");
		int m=s.nextInt(), n=s.nextInt(),evenCount=0,oddCount=0;
		while(m<=n){
			if(m%2==0)
				evenCount++;
			else 
				oddCount++;
			m++;
		}
		System.out.println("Even count is : "+evenCount);
		System.out.println("Odd count is : "+oddCount);
	}
}
