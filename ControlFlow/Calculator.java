import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Substraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		int choice = s.nextInt();
		switch(choice)
		{
			case 1 : { 
				       System.out.println("Enter 2 numbers for Addition");
					   int a = s.nextInt(),b=s.nextInt();
					   System.out.println(a+" + "+b+" = "+(a+b));
			         }
					 break;
			case 2 : { 
				       System.out.println("Enter 2 numbers for Substraction");
					   int a = s.nextInt(),b=s.nextInt();
					   System.out.println(a+" - "+b+" = "+(a-b));
			         }
					 break;
			case 3 : { 
				       System.out.println("Enter 2 numbers for Multiplication");
					   int a = s.nextInt(),b=s.nextInt();
					   System.out.println(a+" * "+b+" = "+(a*b));
			         }
					 break;
			case 4 : { 
				       System.out.println("Enter 2 numbers for Division");
					   int a = s.nextInt(),b=s.nextInt();
					   System.out.println(a+" / "+b+" = "+(a/b));
			         }
					 break;		 
					 
	
			default : System.out.println("Invalid Input");		
		}
	}
}
