class SwapWithout3rd 
{
	public static void main(String[] args) 
	{
		int a = 99,b = 45;
		System.out.println("Before Swap "+a+" & "+b);
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("After Swap "+a+" & "+b);
	}
}
