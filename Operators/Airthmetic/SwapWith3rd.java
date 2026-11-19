class SwapWith3rd 
{
	public static void main(String[] args) 
	{
		int a = 99,b = 45;
		System.out.println("Before Swap "+a+" & "+b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After Swap "+a+" & "+b);
	}
}
