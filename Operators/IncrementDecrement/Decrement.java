class Decrement 
{
	public static void main(String[] args) 
	{
		int a = 23,b=45;
		int c = a-- + b-- + --a + --b;
		System.out.println(a+" "+b +" "+c);
	}
}
