import java.util.Scanner;
class GreatestOf2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int a = s.nextInt(),b= s.nextInt();
		if(a>b){
			System.out.println(a+ " is greater than"+ b);
		}else{
			System.out.println(b+ " is greater than "+a);
		}
	}
}
