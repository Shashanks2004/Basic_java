import java.util.Scanner; 
class Sum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter m & n value: ");
		int m=1, n=s.nextInt(),sum=0;
		while(m<=n){
			sum+=m;
			m++;
		}
		System.out.println("Sum is : "+sum);
	}
}
